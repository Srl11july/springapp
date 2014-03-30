package org.myonlineapp.daoImpl;

import org.myonlineapp.common.dao.GenericDaoImpl;
import org.myonlineapp.dao.IQuestionDao;
import org.myonlineapp.model.Question;
import org.springframework.stereotype.Repository;

@Repository
public class QuestionDaoImpl extends GenericDaoImpl<Question,Long>  implements IQuestionDao {

}
