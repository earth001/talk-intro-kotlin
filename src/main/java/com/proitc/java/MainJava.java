package com.proitc.java;

import static java.util.Comparator.comparingInt;

import java.util.List;
import java.util.OptionalInt;

public class MainJava {

  public static void main(String[] args) {
    final var estudiantes = List
        .of(new EstudianteJava("Julio"), new EstudianteJava("María", OptionalInt.of(12)));
    final var mayorPuntaje = estudiantes.stream().max(comparingInt(es -> es.puntaje().orElse(0)));
    //String literal is preview feature in Java 14
    System.out
        .println(String.format(
            """
                El mayor puntaje en Java es de: 
                  %s
                """, mayorPuntaje.orElse(null)));
  }
}
