package com.ssaffron.business.api.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "fee")
@Getter
@RequiredArgsConstructor
public class FeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fee_idx")
    private int feeIdx;

    @Column(name = "type", nullable = false, length = 20)
    private String type;

    @Column(name = "details", nullable = false, length = 20)
    private String details;

    @Column(name = "price", nullable = false)
    private int price;

    @Column(name = "description", nullable = false, length = 20)
    private String description;

//    @OneToOne(mappedBy = "feeEntity")
//    private ChargeEntity chargeEntity;
}
