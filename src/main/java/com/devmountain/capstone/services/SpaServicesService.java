package com.devmountain.capstone.services;

import com.devmountain.capstone.dtos.SpaServicesDto;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface SpaServicesService {
    @Transactional
    Optional<SpaServicesDto> getSpaServices(Long services);

    @Transactional
    List<SpaServicesDto> getAllSpaServices();
}
