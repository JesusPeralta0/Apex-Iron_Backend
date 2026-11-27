package com.apexiron.ecommerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_usuario", nullable = false, unique = true)
  private Integer id;

  @Column(name = "nombre", nullable = false, length = 45)
  private String nombre;

  @Column(name = "apellido", nullable = false, length = 45)
  private String apellido;

  @Column(name = "correo", nullable = false, unique = true, length = 45)
  private String correo;

  @Column(name = "contraseña", nullable = false, length = 225)
  private String contrasena;

  @Column(name = "telefono", nullable = false, length = 45)
  private String telefono;

  @Column(name = "direccion", nullable = false, length = 150)
  private String direccion;

  @Column(name = "isAdmin", nullable = false)
  private Boolean isAdmin;

  public Usuario() {}

  public Usuario(
      String nombre, String apellido, String correo, String contrasena,
      String telefono, String direccion, Boolean isAdmin) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.correo = correo;
    this.contrasena = contrasena;
    this.telefono = telefono;
    this.direccion = direccion;
    this.isAdmin = isAdmin;
  }

  public Integer getId() {
    return id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public String getCorreo() {
    return correo;
  }

  public void setCorreo(String correo) {
    this.correo = correo;
  }

  public String getContrasena() {
    return contrasena;
  }

  public void setContrasena(String contrasena) {
    this.contrasena = contrasena;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public Boolean getIsAdmin() {
    return isAdmin;
  }

  public void setIsAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
  }

  @Override
  public String toString() {
    return "Usuario [getId()=" + getId()
        + ", getNombre()=" + getNombre()
        + ", getApellido()=" + getApellido()
        + ", getCorreo()=" + getCorreo()
        + ", getContrasena()=" + getContrasena()
        + ", getTelefono()=" + getTelefono()
        + ", getDireccion()=" + getDireccion()
        + ", getIsAdmin()=" + getIsAdmin() + "]";
  }
}
