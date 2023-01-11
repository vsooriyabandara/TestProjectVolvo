package com.pos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {

    private int customer_id;
    private String name;
    private String address;
    private double salary;
    private ArrayList<String> contactNumber;
    private String nic;
    private boolean active;

}
