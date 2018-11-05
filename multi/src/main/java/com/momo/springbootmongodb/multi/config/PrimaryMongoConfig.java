package com.momo.springbootmongodb.multi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author: MQG
 * @date: 2018/11/5
 */
@Configuration
@EnableMongoRepositories(basePackages = "com.momo.springbootmongodb.multi.dao.primary",
        mongoTemplateRef = PrimaryMongoConfig.MONGO_TEMPLATE)
public class PrimaryMongoConfig {

    public static final String MONGO_TEMPLATE = "primaryMongoTemplate";
}
