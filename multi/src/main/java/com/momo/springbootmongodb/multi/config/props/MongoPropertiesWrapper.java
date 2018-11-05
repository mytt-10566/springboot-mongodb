package com.momo.springbootmongodb.multi.config.props;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: MQG
 * @date: 2018/11/5
 */
@Component
@ConfigurationProperties(prefix = "mongodb")
public class MongoPropertiesWrapper {
    
    private String primaryHost;

    private MongoProperties primary = new MongoProperties();
    private MongoProperties secondary = new MongoProperties();

    public MongoProperties getPrimary() {
        return primary;
    }

    public void setPrimary(MongoProperties primary) {
        this.primary = primary;
    }

    public MongoProperties getSecondary() {
        return secondary;
    }

    public void setSecondary(MongoProperties secondary) {
        this.secondary = secondary;
    }

    public String getPrimaryHost() {
        return primaryHost;
    }

    public void setPrimaryHost(String primaryHost) {
        this.primaryHost = primaryHost;
    }
}
