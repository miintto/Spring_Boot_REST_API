package com.tutorial.springboot.api.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name="order_info")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String orderCd;
    private String userId;
    private int price;
    private int payPrice;
    private int minusPrice;
    private LocalDate saleDate;

//    @OneToMany(mappedBy = "orderInfo")
//    private Set<OrderProduct> orderProductList = new LinkedHashSet<>();

}
