package com.devmountain.capstone.entities;

import com.devmountain.capstone.dtos.UsersDto;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(unique = true)
    private String username;

    @Column(unique = true)
    private String password;


    @OneToMany(mappedBy = "users", fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JsonManagedReference
    private Set<MakeAppointment> makeAppointmentSet = new HashSet<>();

    public Users(UsersDto usersDto){
        if (usersDto.getUsername() != null){
            this.username = usersDto.getUsername();
        }
        if (usersDto.getPassword() != null){
            this.password = usersDto.getPassword();
        }
    }
}
