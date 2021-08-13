package com.anierl.repository;

import com.anierl.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author JiMeiling
 * @Description DAO层
 * @create 2021-08-13 11:04
 */
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUserName(String userName);
    User findByUserNameOrEmail(String username,String email);
}
