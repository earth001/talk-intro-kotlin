package com.proitc.java;

import static java.util.Comparator.comparingInt;

import java.util.List;

public class MainJava {

  public static void main(String[] args) {
    final var estudiantes = List
        .of(new EstudianteJava("Julio"), new EstudianteJava("María", 12));
    final var mayorPuntaje = estudiantes.stream().max(comparingInt(es -> {
      if (es.puntaje() == null) {
        return 0;
      } else {
        return es.puntaje();
      }
    }));
    //String literal is preview feature in Java 14
    System.out
        .println(String.format(
            """
                El mayor puntaje en Java es de: 
                  %s
                """, mayorPuntaje.orElse(null)));
  }
}
