package com.example.talentmanagementsystem.service.impl;

import com.example.talentmanagementsystem.entity.JobSeeker;

/**
 * @author Mr.张
 */
public interface JobSeekerService {
    /**
     * 登记
     * @param user
     * @return
     */
    int register(JobSeeker user);

    /**
     * 登录功能
     * @param userid
     * @param password
     * @return
     */
    JobSeeker login(String userid, String password);

    /**
     * 验证邮箱
     * @param userEmail
     * @return
     */
    JobSeeker findemail(String userEmail);

    /**
     * 验证账号
     * @param userId
     * @return
     */
    JobSeeker finduserid(String userId);
}
