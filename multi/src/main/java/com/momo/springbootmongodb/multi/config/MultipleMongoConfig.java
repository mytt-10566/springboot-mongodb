package com.momo.springbootmongodb.multi.config;

import com.momo.springbootmongodb.multi.config.props.MongoPropertiesWrapper;
import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

/**
 * @author: MQG
 * @date: 2018/11/5
 */
@Configuration
public class MultipleMongoConfig {

    @Autowired
    private MongoPropertiesWrapper mongoPropertiesWrapper;
    

    @Bean(PrimaryMongoConfig.MONGO_TEMPLATE)
    @Primary
    public MongoTemplate primaryMongoTemplate() throws Exception {
        return new MongoTemplate(this.primaryFactory(this.mongoPropertiesWrapper.getPrimary()));
    }

    @Bean(SecondaryMongoConfig.MONGO_TEMPLATE)
    public MongoTemplate secondaryMongoTemplate() throws Exception {
        return new MongoTemplate(this.secondaryFactory(this.mongoPropertiesWrapper.getSecondary()));
    }

    @Bean
    @Primary
    public MongoDbFactory primaryFactory(MongoProperties mongoProperties) throws Exception {
        return new SimpleMongoDbFactory(new MongoClient(mongoProperties.getHost(), mongoProperties.getPort()), 
                mongoProperties.getDatabase());
    }

    @Bean
    public MongoDbFactory secondaryFactory(MongoProperties mongoProperties) throws Exception {
        return new SimpleMongoDbFactory(new MongoClient(mongoProperties.getHost(), mongoProperties.getPort()),
                mongoProperties.getDatabase());
    }
}
