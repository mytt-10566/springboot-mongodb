package com.momo.springbootmongodb.multi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author: MQG
 * @date: 2018/11/5
 */
@Configuration
@EnableMongoRepositories(basePackages = "com.momo.springbootmongodb.multi.dao.sencodary",
        mongoTemplateRef = SecondaryMongoConfig.MONGO_TEMPLATE)
public class SecondaryMongoConfig {
    public static final String MONGO_TEMPLATE = "secondaryMongoTemplate";
}
