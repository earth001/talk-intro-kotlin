package com.proitc.java;

import java.util.Objects;

public class EstudianteJava {

  private final String nombre;
  private final Integer puntaje;

  EstudianteJava(String nombre, Integer puntaje) {
    Objects.requireNonNull(nombre);
    this.nombre = nombre;
    this.puntaje = puntaje;
  }

  EstudianteJava(String nombre) {
    this(nombre, null);
  }

  public String getNombre() {
    return nombre;
  }

  public Integer getPuntaje() {
    return puntaje;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EstudianteJava person = (EstudianteJava) o;
    return Objects.equals(getNombre(), person.getNombre()) &&
        Objects.equals(getPuntaje(), person.getPuntaje());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getNombre(), getPuntaje());
  }

  @Override
  public String toString() {
    return "EstudianteJava{" +
        "nombre='" + getNombre() + '\'' +
        ", puntaje=" + getPuntaje() +
        '}';
  }


}
