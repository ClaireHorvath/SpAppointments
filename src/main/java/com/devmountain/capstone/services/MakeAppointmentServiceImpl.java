package com.devmountain.capstone.services;

import com.devmountain.capstone.dtos.MakeAppointmentDto;
import com.devmountain.capstone.dtos.SpaServicesDto;
import com.devmountain.capstone.entities.MakeAppointment;
import com.devmountain.capstone.entities.Users;
import com.devmountain.capstone.repositories.MakeAppointmentRepository;
import com.devmountain.capstone.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class MakeAppointmentServiceImpl implements MakeAppointmentService {
    @Autowired
    public UsersRepository userRepository;

    @Autowired
    public MakeAppointmentRepository makeAppointmentRepository;

    @Override
    @Transactional
    public Optional<MakeAppointmentDto> getMakeupAppointment(Long appointment) {
        Optional<MakeAppointment> makeAppointmentOptional = makeAppointmentRepository.findById(appointment);
        if (makeAppointmentOptional.isPresent()) {
            return Optional.of(new MakeAppointmentDto(makeAppointmentOptional.get()));
        }
        return Optional.empty();
    }

    @Override
    public List<SpaServicesDto> getAllSpaServices() {
        return null;
    }

//    @Override
//    @Transactional
//    public void updateAppointment(MakeAppointmentDto makeAppointmentDto) {
//        Optional<MakeAppointment> makeAppointmentOptional = makeAppointmentRepository.findById(makeAppointmentDto.getUserId());
//        makeAppointmentOptional.ifPresent(makeAppointment -> {
//            makeAppointment.setSpaServices(makeAppointmentDto.getSpaServices());
//            makeAppointmentRepository.saveAndFlush(makeAppointment);
//        });
//    }

    @Override
    @Transactional
    public void createAppointment(MakeAppointmentDto makeAppointmentDto, Long usersId) {
        Optional<Users> userOptional = userRepository.findById(usersId);
        MakeAppointment makeAppointment = new MakeAppointment(makeAppointmentDto);
        userOptional.ifPresent(makeAppointment::setUsers);
        makeAppointmentRepository.saveAndFlush(makeAppointment);
    }

    @Override
    @Transactional
    public void deleteAppointment(Long makeAppointmentId) {
        Optional<MakeAppointment> appointmentOptional = makeAppointmentRepository.findById(makeAppointmentId);
        appointmentOptional.ifPresent(makeAppointment -> makeAppointmentRepository.delete(makeAppointment));
    }

    @Override
    @Transactional
    public Optional<MakeAppointmentDto> getAllAppointmentsByUserId(Long makeAppointmentId) {
        Optional<MakeAppointment> makeAppointmentOptional = makeAppointmentRepository.findById(makeAppointmentId);
        if (makeAppointmentOptional.isPresent()) {
            return Optional.of(new MakeAppointmentDto(makeAppointmentOptional.get()));
        }
        return Optional.empty();
    }
}
