package com.devmountain.capstone.controllers;

import com.devmountain.capstone.dtos.UsersDto;
import com.devmountain.capstone.services.UsersService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UsersService usersService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public List<String> addUsers(@RequestBody UsersDto usersDto) {
        String passHash = passwordEncoder.encode(usersDto.getPassword());
        usersDto.setPassword(passHash);
        return usersService.addUsers(usersDto);
    }

    @PostMapping("/login")
    public List<String> usersLogin(@RequestBody UsersDto usersDto) {

        return usersService.usersLogin(usersDto);
    }
}
