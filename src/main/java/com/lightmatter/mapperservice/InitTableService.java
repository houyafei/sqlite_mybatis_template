package com.lightmatter.mapperservice;

import com.lightmatter.mappers.mapper.InitTableMapper;
import com.lightmatter.util.MybatisUtil;
import com.lightmatter.util.SqlUtil;
import org.apache.ibatis.session.SqlSession;

public class InitTableService {

    private InitTableMapper initTableMapper;
    private SqlSession session;
    public InitTableService() {
        session= MybatisUtil.getSession();

        this.initTableMapper = session.getMapper(InitTableMapper.class);
    }

    public void  creatStudentTable(){
        initTableMapper.createUserTable();
        session.commit(true);
        session.close();
//        SqlUtil.creatTables();
    }
}
