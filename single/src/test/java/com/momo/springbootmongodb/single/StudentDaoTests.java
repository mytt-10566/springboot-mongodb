package com.momo.springbootmongodb.single;

import com.momo.springbootmongodb.single.dao.StudentDao;
import com.momo.springbootmongodb.single.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentDaoTests {
	
	@Autowired
	private StudentDao studentDao;

	@Test
	public void testInsert() {
		Student student = new Student();
		student.setId(1L);
		student.setStuName("小明" + System.currentTimeMillis());
		student.setStuNo("202141522");
		studentDao.insert(student);
	}

	// 不存在则保存，存在则更新
	@Test
	public void testSave() {
		Student student = new Student();
		student.setId(1L);
		student.setStuName("小明" + System.currentTimeMillis());
		student.setStuNo("202141522");
		studentDao.save(student);
	}
	
	@Test
	public void testDelete() {
		studentDao.delete(1L);
	}
	
}
