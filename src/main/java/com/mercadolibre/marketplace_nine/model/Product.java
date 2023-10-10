package com.mercadolibre.marketplace_nine.model;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Product Entity.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(length = 50)
  @NotBlank
  private String title;

  @Positive
  @NotBlank
  @Column(length = 10)
  private BigDecimal price;

  @NotNull
  @Column
  private String description;

  @NotNull
  @Column
  private String image;

  @ManyToOne
  @JoinColumn(name = "category")
  private Category category;
}
