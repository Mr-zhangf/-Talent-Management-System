package com.example.talentmanagementsystem.mapper;

import com.example.talentmanagementsystem.entity.JobSeeker;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Mr.张
 */
@Mapper
public interface JobSeekerMapper {

    /**
     * 登记 SQL
     * @param user
     * @return
     */
    @Insert("INSERT INTO job_seeker(useId, userName, userPassword, userEmail, createtime, userPhone) VALUES(#{useId}，#{userName}，#{userPassword}，#{userEmail}，#{createtime}，#{userPhone}")
    int register(JobSeeker user);

    /**
     * 登录 SQL
     * @param userid
     * @param password
     * @return
     */
    @Insert("SELECT userId, userPassword FROM job_seeker WHERE userId = #{userId} AND userPassword = #{userPassword}")
    JobSeeker login(String userid, String password);

    /**
     * 验证邮箱 SQL
     * @param userEmail
     * @return
     */
    @Insert("SELECT userEmail FROM job_seeker WHERE userEmail = #{userEmail}")
    JobSeeker findemail(String userEmail);

    /**
     * 验证姓名 SQL
     * @param userId
     * @return
     */
    @Insert("SELECT userId FROM job_seeker WHERE userId = #{userId}")
    JobSeeker finduserid(String userId);
}
