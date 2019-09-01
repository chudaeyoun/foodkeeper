package com.foodkeeper.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "skus")
@Data
public class Sku extends BaseEntity {
    @Column(name = "name", length = 10)
    private String name;

    @Column(name = "price", nullable = false)
    private int price;

    @Column(name = "barcode")
    private String barcode;

    @Column(name = "expired_at", nullable = false)
    private String expiredAt;
}
