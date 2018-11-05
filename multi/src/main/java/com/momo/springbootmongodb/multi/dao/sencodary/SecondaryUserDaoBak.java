package com.momo.springbootmongodb.multi.dao.sencodary;

import com.momo.springbootmongodb.multi.config.SecondaryMongoConfig;
import com.momo.springbootmongodb.multi.entity.secondary.SecondaryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author: MQG
 * @date: 2018/11/5
 */
@Repository
public class SecondaryUserDaoBak {

    @Autowired
    @Qualifier(SecondaryMongoConfig.MONGO_TEMPLATE)
    private MongoTemplate mongoTemplate;

    public void saveUser(SecondaryUser user) {
        mongoTemplate.save(user);
    }

}
