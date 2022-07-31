package com.mightycoder.sprmicrosproj1.user.controller;

import com.mightycoder.sprmicrosproj1.user.VO.ResponseTemplateVO;
import com.mightycoder.sprmicrosproj1.user.entity.User;
import com.mightycoder.sprmicrosproj1.user.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Slf4j
@AllArgsConstructor
public class UserController {

    public final UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("Inside saveUser of UserController");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId){
        log.info("Inside getUserWithDepartment of UserController");
        return userService.getUserWithDepartment(userId);
    }

}
