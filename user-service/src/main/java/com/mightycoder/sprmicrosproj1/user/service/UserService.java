package com.mightycoder.sprmicrosproj1.user.service;

import com.mightycoder.sprmicrosproj1.user.VO.Department;
import com.mightycoder.sprmicrosproj1.user.VO.ResponseTemplateVO;
import com.mightycoder.sprmicrosproj1.user.entity.User;
import com.mightycoder.sprmicrosproj1.user.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {

    @Value("${department-service}")
    private String departmentServiceURL;

    private final UserRepository userRepository;

    private final RestTemplate restTemplate;

    public UserService(UserRepository userRepository, RestTemplate restTemplate) {
        this.userRepository = userRepository;
        this.restTemplate = restTemplate;
    }

    public User saveUser(User user) {
        log.info("inside saveUser of UserService");
        return userRepository.save(user);
    }

    public ResponseTemplateVO getUserWithDepartment(Long userId) {
        log.info("inside getUserWithDepartment of UserService");

        var user = userRepository.findById(userId).orElseThrow(() ->
                new RuntimeException("User with id " + userId + " is not found"));

        var department = restTemplate
                .getForObject(departmentServiceURL + "department/" + user.getDepartmentId(), Department.class);

        return new ResponseTemplateVO(user, department);
    }
}
