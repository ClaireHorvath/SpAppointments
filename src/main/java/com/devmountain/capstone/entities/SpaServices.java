package com.devmountain.capstone.entities;

import com.devmountain.capstone.dtos.SpaServicesDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "SpaServices")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SpaServices {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usersId;


    @Column
    public String service;

    @Column
    public String description;

    @Column
    public String aesthetician;

    @Column
    public double price;


    public SpaServices(SpaServicesDto spaServicesDto) {
        if (spaServicesDto.getService() != null) {
            this.service = spaServicesDto.getService();
        }
        if (spaServicesDto.getDescription() != null) {
            this.description = spaServicesDto.getDescription();
        }
        if (spaServicesDto.getAesthetician() != null) {
            this.aesthetician = spaServicesDto.getAesthetician();
        }
        this.price = spaServicesDto.getPrice();
    }
}
