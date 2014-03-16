package org.myonlineapp.common.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDao<T extends Serializable, Long> {

    public T find(Serializable id);

    public void delete(T obj);

    public T merge(T obj);
    
    public Serializable createNew(T obj);
    
    public T get(Serializable id);
    
    public List<T> list();
}