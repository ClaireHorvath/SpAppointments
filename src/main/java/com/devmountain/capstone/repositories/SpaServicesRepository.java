package com.devmountain.capstone.repositories;

import com.devmountain.capstone.entities.SpaServices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpaServicesRepository extends JpaRepository<SpaServices, Long> {
    List<SpaServices> findAll();
}
