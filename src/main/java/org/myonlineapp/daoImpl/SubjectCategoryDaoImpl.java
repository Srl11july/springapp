package org.myonlineapp.daoImpl;

import org.myonlineapp.common.dao.GenericDaoImpl;
import org.myonlineapp.dao.ISubjectCategoryDao;
import org.myonlineapp.model.SubjectCategory;
import org.springframework.stereotype.Repository;

@Repository
public class SubjectCategoryDaoImpl extends GenericDaoImpl<SubjectCategory,Long>  implements ISubjectCategoryDao {

}
