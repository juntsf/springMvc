package com.hqyj.mubatis;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import com.hqyj.mybatis.entity.User;

import aom.hqyj.ymbatis.mapper.UserMapper;


public class TestUserMapper {
	
	private SqlSession session;
	// @Test注解对应的方法执行之前，先执行@Before对应的方法
	@Before
	public void begin() throws IOException{
		// 1. 配置文件的路径
		String resource = "mybatis-config.xml";
		// 2. 创建InputStream流
		InputStream inputStream = Resources.getResourceAsStream(resource);
		// 3. 创建SqlSessionFactory 
		SqlSessionFactory  sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		// 4. 创建SqlSession
		session = sessionFactory.openSession();
	}
	// @Test注解对应的方法执行之后，再执行@After对应的方法
	@After
	public void after() {
		// 1. 数据的commit: 实现数据库和程序中的数据同步更新
		session.commit();// update, insert, delete必须commit  
		// 2. 关闭session
		session.close();
	}
	
	@Test
	public void testGetAllUser() {
		UserMapper userMapper =session.getMapper(UserMapper.class);
		List<User> list = userMapper.getAllUser();
		for(User user:list) {
			System.out.println(user);
		}
	}

}
