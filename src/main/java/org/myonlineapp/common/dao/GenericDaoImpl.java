package org.myonlineapp.common.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.TypeVariable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class GenericDaoImpl<T extends Serializable, Long> implements GenericDao<T, Long> {

    private Class<T> type;

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    protected SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            throw new IllegalStateException("SessionFactory has not been set on DAO before usage");
        }
        return sessionFactory;
    }

    public Class<T> getType() {
        return type;
    }

    
	
	public GenericDaoImpl() {
        try {
            this.type = (Class<T>) ((ParameterizedType) this.getClass().getSuperclass().getGenericSuperclass()).getActualTypeArguments()[0];
        } catch (Exception e) {
            try {
                this.type = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
            } catch (Exception ex) {
                this.type = (Class<T>) ((TypeVariable) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0]).getGenericDeclaration().getTypeParameters()[0].getBounds()[0];
                ex.printStackTrace();
            }
        }


    }

	@Transactional(readOnly = true)
    @Override
    public T find(Serializable id) {
        return (T) getSessionFactory().getCurrentSession().get(getType(), id);
    }

    @Transactional
    @Override
    public void delete(T obj) {
        getSessionFactory().getCurrentSession().delete(obj);
    }

    @Transactional
    @Override
    public T merge(T obj) {
        return (T) getSessionFactory().getCurrentSession().merge(obj);
    }

    @Transactional
    @Override
    public Serializable createNew(T obj) {
        return getSessionFactory().getCurrentSession().save(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Transactional
    @Override
    public T get(Serializable id) {
        return (T) getSessionFactory().getCurrentSession().get(type, id);
    }
    
    @Transactional
    public List<T> list()
    {
        Criteria criteria=  getSessionFactory().getCurrentSession().createCriteria(type);
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        return criteria.list();
    }

}
