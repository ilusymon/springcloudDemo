package com.atguigu.dao;

import com.atguigu.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Symon
 * @version 1.0
 * @className UserDao
 * @description TODO
 * @date 2020/12/14 14:25
 */
public interface UserDao extends JpaRepository<User,Integer> {
}
