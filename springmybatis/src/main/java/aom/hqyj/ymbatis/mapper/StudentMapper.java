package aom.hqyj.ymbatis.mapper;

import java.util.List;

import com.hqyj.mybatis.entity.Student;

public interface StudentMapper {
	public abstract List<Student> getAllStudent();
	
	void deleteOne(int abc);
	
	void insertOne(Student student);
	
	void updateOne(Student student);
}
