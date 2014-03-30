package org.myonlineapp.daoImpl;

import org.myonlineapp.common.dao.GenericDaoImpl;
import org.myonlineapp.dao.ITestDao;
import org.myonlineapp.model.Test;
import org.springframework.stereotype.Repository;

@Repository
public class TestDaoImpl extends GenericDaoImpl<Test,Long>  implements ITestDao {

}
