package org.myonlineapp.daoImpl;

import org.myonlineapp.common.dao.GenericDaoImpl;
import org.myonlineapp.dao.IUserDao;
import org.myonlineapp.model.User;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl extends GenericDaoImpl<User,Long>  implements IUserDao{

	
}
