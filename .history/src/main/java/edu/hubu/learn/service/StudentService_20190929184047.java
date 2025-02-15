package edu.hubu.learn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hubu.learn.dao.StudentDao;

import edu.hubu.learn.entity.Student;

@Service
public class StudentService {

    @Autowired
    private StudentDao StudentDao;

    public Student getUser(Long id) {
        return StudentDao.findById(id).get();
    }
}