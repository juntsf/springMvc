package aom.hqyj.ymbatis.mapper;

import java.util.List;

import com.hqyj.mybatis.entity.User;

public interface UserMapper {
	List<User> getAllUser();
	void insertUser(User user);
}
