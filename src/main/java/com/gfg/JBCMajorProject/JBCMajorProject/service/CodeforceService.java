package com.gfg.JBCMajorProject.JBCMajorProject.service;

import com.gfg.JBCMajorProject.JBCMajorProject.dao.UserCodeforceDao;
import com.gfg.JBCMajorProject.JBCMajorProject.model.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class CodeforceService {
    @Autowired
    UserCodeforceDao userCodeforceDao;

    public List<Result> getUser( String handle){
        return userCodeforceDao.getUser(handle);
    }
}
