package com.momo.springbootmongodb.multi;

import com.momo.springbootmongodb.multi.dao.primary.PrimaryUserDao;
import com.momo.springbootmongodb.multi.dao.sencodary.SecondaryUserDao;
import com.momo.springbootmongodb.multi.entity.primary.PrimaryUser;
import com.momo.springbootmongodb.multi.entity.secondary.SecondaryUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MultiApplicationTests {

    @Autowired
    private PrimaryUserDao primaryUserDao;

    @Autowired
    private SecondaryUserDao secondaryUserDao;

    @Test
    public void testSave() {
        this.primaryUserDao.save(new PrimaryUser(1L, "p-小明"));

        this.secondaryUserDao.save(new SecondaryUser(2L, "sec-小明"));

        List<PrimaryUser> primaries = this.primaryUserDao.findAll();
        for (PrimaryUser primary : primaries) {
            System.out.println(primary.toString());
        }

        List<SecondaryUser> secondaries = this.secondaryUserDao.findAll();
        for (SecondaryUser secondary : secondaries) {
            System.out.println(secondary.toString());
        }
    }
}
