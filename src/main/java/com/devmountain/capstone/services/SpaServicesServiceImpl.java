package com.devmountain.capstone.services;

import com.devmountain.capstone.dtos.SpaServicesDto;
import com.devmountain.capstone.entities.SpaServices;
import com.devmountain.capstone.repositories.SpaServicesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SpaServicesServiceImpl implements SpaServicesService {
    @Autowired
    private SpaServicesRepository spaServicesRepository;

    @Override
    @Transactional
    public Optional<SpaServicesDto> getSpaServices(Long services) {
        Optional<SpaServices> spaServicesOptional = spaServicesRepository.findById(services);
        if (spaServicesOptional.isPresent()) {
            return Optional.of(new SpaServicesDto(spaServicesOptional.get()));
        }
        return Optional.empty();
    }

    @Override
    @Transactional
    public List<SpaServicesDto> getAllSpaServices() {
        List<SpaServices> spaServicesList = spaServicesRepository.findAll();
        return spaServicesList.stream().map(services -> new SpaServicesDto(services)).collect(Collectors.toList());
    }
}
