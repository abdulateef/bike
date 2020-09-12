package com.example.bike.Model;


import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Getter
@Setter
public class Bike {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    @NonNull
    private  String Name;
    @NonNull
    private  String Email;
    private String PhoneNumber;
    private  String Model;
    private String SerialNumber;
    private BigDecimal PurchaseOrder;
    private Date PurchaseDate;
    private String Contact;

}
