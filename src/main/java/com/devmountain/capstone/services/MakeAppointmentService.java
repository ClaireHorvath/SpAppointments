package com.devmountain.capstone.services;

import com.devmountain.capstone.dtos.MakeAppointmentDto;
import com.devmountain.capstone.dtos.SpaServicesDto;
import com.devmountain.capstone.entities.MakeAppointment;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface MakeAppointmentService {
    @Transactional
    Optional<MakeAppointmentDto> getMakeupAppointment(Long appointment);

    List<SpaServicesDto> getAllSpaServices();

    @Transactional
    void createAppointment(MakeAppointmentDto makeAppointmentDto, Long usersId);

    @Transactional
    void deleteAppointment(Long makeAppointmentId);

    @Transactional
    Optional<MakeAppointmentDto> getAllAppointmentsByUserId(Long makeAppointmentId);
}
