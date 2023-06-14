package com.devmountain.capstone.dtos;

import com.devmountain.capstone.entities.SpaServices;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class SpaServicesDto implements Serializable {
    private Long usersId;
    public String service;
    public String description;
    public String aesthetician;
    public double price;

    public SpaServicesDto(SpaServices spaServices) {
        if (spaServices.getUsersId() != null) {
            this.usersId = spaServices.getUsersId();
        }
        if (spaServices.getService() != null) {
            this.service = spaServices.getService();
        }
        if (spaServices.getDescription() != null) {
            this.description = spaServices.getDescription();
        }
        if (spaServices.getAesthetician() != null) {
            this.aesthetician = spaServices.getAesthetician();
        }
        this.price = spaServices.getPrice();
    }
}
