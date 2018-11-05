package com.momo.springbootmongodb.single.dao;

import com.momo.springbootmongodb.single.entity.User;
import com.mongodb.WriteResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

/**
 * @author: MQG
 * @date: 2018/11/5
 */
@Repository
public class UserDao {
    
    @Autowired
    private MongoTemplate mongoTemplate;
    
    public void saveUser(User user) {
        mongoTemplate.save(user);
    }
    
    public User findUserByUserName(String userName) {
        Query query = new Query(Criteria.where("userName").is(userName));
        User user = mongoTemplate.findOne(query, User.class);
        return user;
    }
    
    public void updateUser(User user) {
        Query query = new Query(Criteria.where("id").is(user.getId()));
        Update update = new Update().set("userName", user.getUserName()).set("password", user.getPassword());
        // 更新查询结果的第一条
        WriteResult writeResult1 = mongoTemplate.updateFirst(query, update, User.class);
        System.out.println("影响记录数：" + writeResult1.getN());
        // 更新所有查询到的结果
//        WriteResult writeResult2 = mongoTemplate.updateMulti(query, update, User.class);
//        System.out.println("影响记录数：" + writeResult2.getN());
    }
    
    public void deleteUserById(Long id) {
        Query query = new Query(Criteria.where("id").is(id));
        WriteResult writeResult = mongoTemplate.remove(query, User.class);
        System.out.println("影响记录数：" + writeResult.getN());
    }
}
