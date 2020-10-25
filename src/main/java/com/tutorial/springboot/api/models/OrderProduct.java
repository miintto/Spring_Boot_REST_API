package com.tutorial.springboot.api.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="order_product")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderProduct {

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "order_cd")
//    private OrderInfo orderInfo;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String orderCd;
    private int seqNo;
    private String productCd;
    private int saleCnt;
    private int price;
    private int payPrice;
    private int minusPrice;
    private LocalDate saleDate;


}
