package com.devmountain.capstone.repositories;

import com.devmountain.capstone.entities.MakeAppointment;
import com.devmountain.capstone.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MakeAppointmentRepository extends JpaRepository<MakeAppointment, Long> {
    List<MakeAppointment> findAllByUsersEquals(Users users);

}
