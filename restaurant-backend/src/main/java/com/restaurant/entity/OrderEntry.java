package com.restaurant.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "ORDER_ENTRY")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long id;

    @Column(name = "QUANTITY")
    private Integer quantity;

    @Column(name = "TOTAL_PRICE")
    private BigDecimal totalPrice;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="ORDER_ID" )
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CART_ID")
    private Cart cart;

    public OrderEntry(Product product, int i, BigDecimal price)
    {
        this.product=product;
        this.quantity=i;
        this.totalPrice=price;
    }
}
