package com.apresentation.springbootsoapexample.service;

import com.apresentation.spring_boot_soap_example.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private static final Map<String, User> users = new HashMap<>();

    @PostConstruct
    public void initialize() {

        User peter = new User();
        peter.setName("Peter");
        peter.setEmpId(1);
        peter.setSalary(2500);

        User sam = new User();
        sam.setName("Sam");
        sam.setEmpId(2);
        sam.setSalary(5000);

        User ryan = new User();
        ryan.setName("Ryan");
        ryan.setEmpId(3);
        ryan.setSalary(7500);

        User vinicius = new User();
        ryan.setName("Vinicius");
        ryan.setEmpId(4);
        ryan.setSalary(9000);

        users.put(peter.getName(), peter);
        users.put(sam.getName(), sam);
        users.put(ryan.getName(), ryan);
        users.put(vinicius.getName(), vinicius);
    };


    public User getUsers(String name) {
        return users.get(name);
    }
}