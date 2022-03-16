package com.example.talentmanagementsystem.controller;

import com.example.talentmanagementsystem.entity.JobSeeker;
import com.example.talentmanagementsystem.mapper.JobSeekerMapper;
import com.example.talentmanagementsystem.service.impl.JobSeekerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

/**
 * @author Mr.张
 */
@RestController

@RequestMapping("/jobseeker")
public class JobSeekerController {

    private final JobSeekerService jobSeekerService;
    private String userId;

    public JobSeekerController(JobSeekerService jobSeekerService) {
        this.jobSeekerService = jobSeekerService;
    }

    @RequestMapping("/register")
    public String register(){
        System.out.println("注册");
        return "register";
    }

    @CrossOrigin
    @PostMapping("/register")
    public String registerNew(@RequestParam("userId") String userId, @RequestParam("userName") String userName, @RequestParam("userPassword") String userPassword,
                              @RequestParam("userEmail") String userEmail, @RequestParam("createtime") String createtime, @RequestParam("userPhone") String userPhone) {

        // 查询数据库是否存在相同的邮箱
        JobSeeker checkemail = jobSeekerService.findemail(userEmail);
        // 查询数据库是否存在相同的ID
        JobSeeker checkusename = jobSeekerService.finduserid(userId);

        if (checkemail != null){
            return "email has existed";
        }
        else if (checkusename != null){
            return "userId has existed";
        }
        else{
            //创建用户对象，并赋值保存
            JobSeeker jobseeker = new JobSeeker();
            //获取当前时间
            Date now = new Date();
            //创建一个唯一表示ID
            String id = UUID.randomUUID().toString();
            jobseeker.setUserId(id);
            jobseeker.setUserName(userName);
            jobseeker.setUserPassword(userPassword);
            jobseeker.setUserEmail(userEmail);
            jobseeker.setCreatetime((Timestamp) now);
            jobseeker.setUserPhone(userPhone);
            return "index";
        }
    }

    @CrossOrigin
    @PostMapping("/login")
    public String loginNew (@RequestBody Map map){

        JobSeeker user = jobSeekerService.login(map.get("username").toString(), map.get("password").toString());
        if (user != null){
            return "index";
        }
        else{
            return "login";
        }
    }



}
