package com.momo.springbootmongodb.single;

import com.momo.springbootmongodb.single.dao.UserDao;
import com.momo.springbootmongodb.single.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTests {
	
	@Autowired
	private UserDao userDao;

	@Test
	public void testSaveUser() {
		User user = new User();
		user.setId(2L);
		user.setUserName("小明" + System.currentTimeMillis());
		user.setPassword("123456");
		userDao.saveUser(user);
	}

	@Test
	public void testFindUserByUserName() {
		User user = userDao.findUserByUserName("小明");
		System.out.println("user：" + user);
	}

	@Test
	public void updateUser() {
		User user = new User();
		user.setId(1L);
		user.setUserName("小名");
		user.setPassword("654321");
		userDao.updateUser(user);
	}
	
	@Test
	public void deleteUserById() {
		userDao.deleteUserById(1L);
	}
	
}
