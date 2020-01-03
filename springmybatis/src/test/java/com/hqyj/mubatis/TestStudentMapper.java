package com.hqyj.mubatis;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hqyj.mybatis.entity.Student;

import aom.hqyj.ymbatis.mapper.StudentMapper;

public class TestStudentMapper {
	SqlSession session ;
		@Before
		public void begin() throws IOException {
			// 1. 配置文件的路径
			String resource = "mybatis-config.xml";
			// 2. 创建InputStream流
			InputStream inputStream = Resources.getResourceAsStream(resource);
			// 3. 创建SqlSessionFactory 
			SqlSessionFactory  sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			// 4. 创建SqlSession
			session = sessionFactory.openSession();
		}
		@After
		public void after() {
			// 8. 数据的commit: 实现数据库和程序中的数据同步更新
			session.commit();// update, insert, delete必须commit  
			// 9. 关闭session
			session.close();
		}
		@Test
		public void stestGetAllStudent() throws IOException {
			// 5. 获取到StudentMapper
			StudentMapper mapper = session.getMapper(StudentMapper.class);
			// 6. 调用接口中的方法
			List<Student> stus = mapper.getAllStudent();
			
			// 7. 遍历集合
			for(Student stu:stus) {
				System.out.println(stu);
			}
		}	
		@Test
		public void testdeleteOne() throws IOException{
			StudentMapper mapper = session.getMapper(StudentMapper.class);
			mapper.deleteOne(26);
		}
		@Test
		public void testUpdateOne() {
			// 1. 获取mapper
			StudentMapper mapper = session.getMapper(StudentMapper.class);
			// 2. 创建student对象
			       Student student = new Student();
			       student.setStu_id(28);
					student.setStu_name("热巴");
					student.setStu_age(28);
					student.setStu_sex(0);
					student.setCls_id(12);
			// 3. 调用方法
			mapper.updateOne(student);
		}
		
		

}
