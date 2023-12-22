package com.restaurant.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "CATEGORY")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @JsonBackReference
    @OneToOne(mappedBy = "category")
    @JsonInclude(Include.NON_NULL)
    private Product product;

    //TODO anatasyon kontrolü yapılmalı !
    // Burada yanlış düşündüm sanırım 1 kategoriye ait bir ürün olabilir olarak düşünüp ilerledim.
}
