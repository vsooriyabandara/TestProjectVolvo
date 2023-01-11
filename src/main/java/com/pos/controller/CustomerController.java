package com.pos.controller;

import org.springframework.web.bind.annotation.*;
import com.pos.dto.CustomerDto;

@RestController
@RequestMapping("/customerController")
@CrossOrigin
public class CustomerController {

    @PostMapping("/saveCustomer")
    public String saveCustomer(@RequestBody CustomerDto  customerDto){
        String name = customerDto.getName();
        return name;
    }
}
