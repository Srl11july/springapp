package org.myonlineapp.daoImpl;

import org.myonlineapp.common.dao.GenericDaoImpl;
import org.myonlineapp.dao.ISubjectDao;
import org.myonlineapp.model.Subject;
import org.springframework.stereotype.Repository;

@Repository
public class SubjectDaoImpl extends GenericDaoImpl<Subject,Long>  implements ISubjectDao{

}
