package ru.stqu.pft.sandbox;

import javax.sound.midi.Soundbank;

public class MyFirstProgram {

  public static void main(String[] args) {

    hello("world");
    hello("text");
    hello("robert");

    double len = 5;

    System.out.println("Powieszchnia o boku " + len + "równa sie " + area(len));

    double a = 4;
    double b = 6;

    System.out.println("Powieszchnia prostokątu o boku " + a + " i " + b + "  równa sie " + area(a, b));
  }

  public static void hello(String sombody) {
    System.out.println("Hello " + sombody + "!");

  }

  public static double area(double len) {
    return len * len;
  }


  public static double area(double a, double b) {
    return a * b;
  }
}

