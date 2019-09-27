package edu.hubu.learn.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.hubu.learn.entity.User;

public interface StudentDao extends JpaRepository<User, Long> {

}