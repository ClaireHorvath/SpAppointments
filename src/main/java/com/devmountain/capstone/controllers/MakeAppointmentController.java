package com.devmountain.capstone.controllers;

import com.devmountain.capstone.dtos.MakeAppointmentDto;
import com.devmountain.capstone.services.MakeAppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/appointment")
public class MakeAppointmentController {
    @Autowired
    public MakeAppointmentService makeAppointmentService;

    @GetMapping("/appointment/{usersId}")
    public Optional<MakeAppointmentDto> getAppointmentByUser(@PathVariable Long usersId) {
        return makeAppointmentService.getAllAppointmentsByUserId(usersId);
    }

//    @PutMapping("/{appointment}")
//    public void updateAppointment(@RequestBody MakeAppointmentDto makeAppointmentDto){
//        makeAppointmentService.updateAppointment(makeAppointmentDto);
//    }

    @PostMapping("/appointment/{usersId}")
    public void createAppointment(@RequestBody MakeAppointmentDto makeAppointmentDto, @PathVariable Long usersId){
        makeAppointmentService.createAppointment(makeAppointmentDto, usersId);
    }

    @DeleteMapping("/{appointment}")
    public void deleteAppointment(@PathVariable Long appointment){
        makeAppointmentService.deleteAppointment(appointment);
    }
}
