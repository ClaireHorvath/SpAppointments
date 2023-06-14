package com.devmountain.capstone.services;

import com.devmountain.capstone.dtos.UsersDto;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UsersService {
    @Transactional
    List<String> addUsers(UsersDto usersDto);

    @Transactional
    List<String> usersLogin(UsersDto usersDto);

    @Transactional
    List<String> userLogin(UsersDto userDto);
}
