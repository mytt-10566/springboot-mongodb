package com.momo.springbootmongodb.multi.entity.primary;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

/**
 * @author: MQG
 * @date: 2018/11/5
 */
@Document(collection = "t_user")
public class PrimaryUser implements Serializable {

    public PrimaryUser() {
    }

    public PrimaryUser(Long id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    @Id
    @Field("id")
    private Long id;

    @Field("user_name")
    private String userName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
