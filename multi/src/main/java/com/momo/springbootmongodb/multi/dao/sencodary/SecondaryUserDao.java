package com.momo.springbootmongodb.multi.dao.sencodary;

import com.momo.springbootmongodb.multi.entity.secondary.SecondaryUser;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author: MQG
 * @date: 2018/11/5
 */
public interface SecondaryUserDao extends MongoRepository<SecondaryUser, Long> {
}
