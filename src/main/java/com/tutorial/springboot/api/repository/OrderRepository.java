package com.tutorial.springboot.api.repository;

import com.tutorial.springboot.api.models.OrderInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderInfo, String> {

//    Optional<OrderInfo> findByOrderCd(String orderCd);

}

