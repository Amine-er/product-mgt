package com.errabi.productservice.entities;

import com.errabi.productservice.enums.Category;
import com.errabi.productservice.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
@Data
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private BigDecimal price;
    private Status status;
    private Category category;
    @Column(name = "created_at")
    private final LocalDateTime createdAt = LocalDateTime.now();
}