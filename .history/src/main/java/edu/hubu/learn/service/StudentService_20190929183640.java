package edu.hubu.learn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hubu.learn.dao.StudentDao;

import edu.hubu.learn.entity.User;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public User getUser(Long id) {
        return studentDao.findById(id).get();
    }
}