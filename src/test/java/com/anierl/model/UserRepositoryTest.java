package com.anierl.model;

import com.anierl.repository.UserRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.DateFormat;
import java.util.Date;

/**
 * @author JiMeiling
 * @Description
 * @create 2021-08-13 13:08
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;
    @Test
    public void test () throws Exception{
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
        String formattedDate = dateFormat.format(date);
        userRepository.save(new User("aa1","aa123456","aa@123.com","aa",formattedDate));
        userRepository.save(new User("bb2","bb123456","bb@123.com","bb",formattedDate));
        userRepository.save(new User("cc3","cc123456","cc@123.com","cc",formattedDate));
        Assert.assertEquals("bb2",userRepository.findByUserNameOrEmail("bb","xxx123.com").getNickName());
        userRepository.delete(userRepository.findByUserName("aa"));
    }
}