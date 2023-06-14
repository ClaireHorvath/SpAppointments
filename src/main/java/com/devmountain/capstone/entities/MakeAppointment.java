package com.devmountain.capstone.entities;

import com.devmountain.capstone.dtos.MakeAppointmentDto;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Table(name = "MakeAppointment")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MakeAppointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column
    public int day;

    @Column
    public double time;

    @Column
    public String aesthetician;

//    @Column(name = "users_id")
//    public Long usersId;

    @Column
    public String spaServices;


    @ManyToOne
    @JsonBackReference
    private Users users;

    public MakeAppointment(MakeAppointmentDto makeAppointmentDto) {

        this.day = makeAppointmentDto.getDay();

        this.time = makeAppointmentDto.getTime();

        if (makeAppointmentDto.getAesthetician() != null) {
            this.aesthetician = makeAppointmentDto.getAesthetician();
        }

//            this.usersId = makeAppointmentDto.getUsersId();

        if (makeAppointmentDto.getSpaServices() != null) {
            this.spaServices = makeAppointmentDto.getSpaServices();
        }
    }
}
