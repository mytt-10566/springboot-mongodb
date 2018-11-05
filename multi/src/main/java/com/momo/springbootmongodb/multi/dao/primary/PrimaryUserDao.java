package com.momo.springbootmongodb.multi.dao.primary;

import com.momo.springbootmongodb.multi.entity.primary.PrimaryUser;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author: MQG
 * @date: 2018/11/5
 */
public interface PrimaryUserDao extends MongoRepository<PrimaryUser, Long> {
}
