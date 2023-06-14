package com.devmountain.capstone.dtos;

import com.devmountain.capstone.entities.Users;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsersDto implements Serializable {
    private Long id;
    private String username;
    private String password;

    public UsersDto(Users users) {
        if (users.getId() != null){
            this.id = users.getId();
        }
        if (users.getUsername() != null){
            this.username = users.getUsername();
        }
        if (users.getPassword() != null){
            this.password = users.getPassword();
        }
    }
}
