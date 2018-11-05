package com.momo.springbootmongodb.single.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

/**
 * @author: MQG
 * @date: 2018/11/5
 */
@Document(collection = "t_student")
public class Student implements Serializable {

    @Id
    @Field("id")
    private Long id;
    
    @Field("stu_name")
    private String stuName;
    
    @Field("stu_no")
    private String stuNo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }
}
