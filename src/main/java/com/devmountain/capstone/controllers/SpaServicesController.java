package com.devmountain.capstone.controllers;

import com.devmountain.capstone.dtos.SpaServicesDto;
import com.devmountain.capstone.services.SpaServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/services")
public class SpaServicesController {
    @Autowired
    public SpaServicesService spaServicesService;

    @GetMapping("/")
    public List<SpaServicesDto> getAllSpaServices() {

        return spaServicesService.getAllSpaServices();
    }
}
