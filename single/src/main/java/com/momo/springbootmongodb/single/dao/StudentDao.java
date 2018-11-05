package com.momo.springbootmongodb.single.dao;

import com.momo.springbootmongodb.single.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author: MQG
 * @date: 2018/11/5
 */
public interface StudentDao extends MongoRepository<Student, Long> {
}
