package com.apexiron.ecommerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categoria")
public class Categoria {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_categoria")
  private Integer idCategoria;

  @Column(name = "categoria", length = 80, nullable = false)
  private String categoria;

  @Column(name = "nombre", length = 45, nullable = false)
  private String nombre;

  @Column(name = "description", columnDefinition = "TEXT", nullable = false)
  private String descripcion;

  public Categoria(String categoria, String nombre, String descripcion) {
    this.categoria = categoria;
    this.nombre = nombre;
    this.descripcion = descripcion;
  }

  public Integer getIdCategoria() {
    return idCategoria;
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
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

  @Override
  public String toString() {
    return "Categoria [getIdCategoria()=" + getIdCategoria()
        + ", getCategoria()=" + getCategoria()
        + ", getNombre()=" + getNombre()
        + ", getDescripcion()=" + getDescripcion() + "]";
  }
}
