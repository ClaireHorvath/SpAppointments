package com.devmountain.capstone.dtos;

import com.devmountain.capstone.entities.MakeAppointment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MakeAppointmentDto implements Serializable {
    public int day;
    public double time;
    public String aesthetician;
    //    public Long usersId;
    public String spaServices;

    public MakeAppointmentDto(MakeAppointment makeAppointment) {

        this.day = makeAppointment.getDay();

        this.time = makeAppointment.getTime();

        if (makeAppointment.getAesthetician() != null) {
            this.aesthetician = makeAppointment.getAesthetician();
        }

//        this.usersId = makeAppointment.getUsersId();

        if (makeAppointment.getSpaServices() != null) {
            this.spaServices = makeAppointment.getSpaServices();
        }
    }
}
