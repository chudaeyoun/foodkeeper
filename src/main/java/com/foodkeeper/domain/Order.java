package com.foodkeeper.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "orders")
@Data
public class Order extends BaseEntity {

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "total_price", nullable = false)
    private int totalPrice;
}
