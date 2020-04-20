package ru.stqu.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {

    hello("world");
    hello("text");
    hello("robert");

    Square s = new Square(5);


    System.out.println("Powieszchnia o boku " + s.l + "równa sie " + s.area());

    Rectangle r = new Rectangle(4,6 );


    System.out.println("Powieszchnia prostokątu o boku " + r.a + " i " + r.b + " równa sie " + r.area());

    Point p1 = new Point(1,1);
    Point p2 = new Point(1, 4);
    System.out.println("Distance between two points " + "(" + p1.x + "," + p1.y + ")," + "(" + p2.x + "," + p2.y + ") = " + p1.distance(p2));

  }

  public static void hello(String sombody) {
    System.out.println("Hello " + sombody + "!");

  }





}




