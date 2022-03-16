package com.example.talentmanagementsystem.service.impl;

import com.example.talentmanagementsystem.entity.JobSeeker;
import com.example.talentmanagementsystem.mapper.JobSeekerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Mr.张
 */
@Service("UserServices")
public class JobSeekerServiceImpl implements JobSeekerService{
    private final JobSeekerMapper jobSeekerMapper;

    public JobSeekerServiceImpl(JobSeekerMapper jobSeekerMapper) {
        this.jobSeekerMapper = jobSeekerMapper;
    }

    @Override
    public int register(JobSeeker user) {
        return jobSeekerMapper.register(user);
    }

    @Override
    public JobSeeker login(String userid, String password) {
        return jobSeekerMapper.login(userid, password);
    }

    @Override
    public JobSeeker findemail(String userEmail) {
        return jobSeekerMapper.findemail(userEmail);
    }

    @Override
    public JobSeeker finduserid(String userId) {
        return jobSeekerMapper.finduserid(userId);
    }
}
