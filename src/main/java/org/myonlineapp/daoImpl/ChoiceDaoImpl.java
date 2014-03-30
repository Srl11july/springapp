package org.myonlineapp.daoImpl;

import org.myonlineapp.common.dao.GenericDaoImpl;
import org.myonlineapp.dao.IChoiceDao;
import org.myonlineapp.model.Choice;
import org.springframework.stereotype.Repository;

@Repository
public class ChoiceDaoImpl extends GenericDaoImpl<Choice,Long>  implements IChoiceDao{

}
