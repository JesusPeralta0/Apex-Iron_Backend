package com.apexiron.ecommerce.model;

import java.math.BigDecimal;

import jakarta.persistence.*;

@Entity
@Table(name = "producto")
public class Producto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_producto")
  private Integer id;

  @Column(name = "nombre", length = 45, nullable = false)
  private String nombre;

  @Column(name = "decription", columnDefinition = "TEXT", nullable = false)
  private String descripcion;

  @Column(name = "precio", precision = 10, scale = 2, nullable = false)
  private BigDecimal precio;

  @Column(name = "stock", nullable = false)
  private Integer stock;

  public Producto(
      String nombre, String descripcion,
      BigDecimal precio, Integer stock
    ) {
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.precio = precio;
    this.stock = stock;
  }

  public Integer getIdProducto() {
    return id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public BigDecimal getPrecio() {
    return precio;
  }

  public void setPrecio(BigDecimal precio) {
    this.precio = precio;
  }

  public Integer getStock() {
    return stock;
  }

  public void setStock(Integer stock) {
    this.stock = stock;
  }

  @Override
  public String toString() {
    return "Producto [getIdProducto()=" + getIdProducto()
        + ", getNombre()=" + getNombre()
        + ", getDescripcion()=" + getDescripcion()
        + ", getPrecio()=" + getPrecio()
        + ", getStock()=" + getStock()
        + "]";
  }
}