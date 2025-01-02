package com.clifav.accounts.entity;


import jakarta.persistence.*;
import lombok.*;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "customer_id")
    private Long customerId;

    private  String name;

    private String email;

    @Column(name = "mobile_number")
    private  String mobileNumber;





}
