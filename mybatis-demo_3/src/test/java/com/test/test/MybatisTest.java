package com.test.test;

import com.test.bean.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Holeyness on 2016/12/7.
 */
public class MybatisTest {
    @Test
    public void test(){
        //构建sqlSessionFactory
        String resource = "mybatis/configuration.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //获取session
        SqlSession session = sqlSessionFactory.openSession();
        try {
            //User user = (User) session.selectOne("com.mybatis.example.UserMapper.selectUserById", 1);
            User user = new User(2, "Maria", "23");

            System.out.println(session.insert("com.mybatis.example.UserMapper.insertUser", user));
        } finally {
            session.close();
        }

    }

}
