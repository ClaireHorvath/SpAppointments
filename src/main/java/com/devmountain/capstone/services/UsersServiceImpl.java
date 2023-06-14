package com.devmountain.capstone.services;

import com.devmountain.capstone.dtos.UsersDto;
import com.devmountain.capstone.entities.Users;
import com.devmountain.capstone.repositories.UsersRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    @Transactional
    public List<String> addUsers(UsersDto usersDto) {
        List<String> response = new ArrayList<>();
        Users users = new Users(new UsersDto());
        userRepository.saveAndFlush(users);
        response.add("http://localhost:7777/home.html");
        return response;
    }

    @Override
    public List<String> usersLogin(UsersDto usersDto) {
        return null;
    }

    @Override
    @Transactional
    public List<String> userLogin(UsersDto userDto) {
        List<String> response = new ArrayList<>();
        Optional<Users> userOptional = userRepository.findByUsername(userDto.getUsername());
        if (userOptional.isPresent()) {
            if (passwordEncoder.matches(userDto.getPassword(), userOptional.get().getPassword())) {
                response.add("User Login was Successful!");
                response.add(String.valueOf(userOptional.get().getId()));
            } else {
                response.add("Username or Password is incorrect");
            }
        } else {
            response.add("Username or Password is incorrect");
        }
        return response;
    }
}
