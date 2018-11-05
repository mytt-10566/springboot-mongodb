package com.momo.springbootmongodb.multi.dao.primary;

import com.momo.springbootmongodb.multi.config.PrimaryMongoConfig;
import com.momo.springbootmongodb.multi.entity.primary.PrimaryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author: MQG
 * @date: 2018/11/5
 */
@Repository
public class PrimaryUserDaoBak {

    @Autowired
    @Qualifier(PrimaryMongoConfig.MONGO_TEMPLATE)
    private MongoTemplate mongoTemplate;

    public void saveUser(PrimaryUser user) {
        mongoTemplate.save(user);
    }

}
