package com.test.service;

import com.test.dao.QtUserMapper;
import com.test.model.QtUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * qt_user
 * @version 1.0 2016-05-11
 * @powerby hetgyd 
 */
@Service
public class QtUserService {
    @Autowired
    private QtUserMapper qtUserMapper;

    public QtUser selectByRecord(QtUser qtUser){
        return this.qtUserMapper.selectByRecord(qtUser);
    }
}

