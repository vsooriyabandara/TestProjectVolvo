package com.pos.entity;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
@Entity(name="Customer")
public class Customer {

    @Id
    @Column(name = "customerId",length = 10)
    private int customer_id;

    @Column(length = 500,nullable = false)
    private String name;

    private String address;

    private double salary;

    @Type(type="json")
    @Column(name="contactNumbers" , columnDefinition="json")
    private ArrayList<String> contactNumber;


    private String nic;

    private boolean active;
}
