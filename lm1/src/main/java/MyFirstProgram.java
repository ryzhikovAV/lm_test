package ru.stqa.pft.sandbox;

public class MyFirstProgram {
  public static void main(String[] args) {

    System.out.println(2 + 2);
    System.out.println(2 - 3);
    System.out.println(1.2 / 3);
    System.out.println(1 / 3.0);
    Square s =new Square(6);

    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());
    Rectangle r =new Rectangle(7,8);
    System.out.println("Площадь прямоугольника  со сторонами " + r.a + ", "+r.b+" = " + r.area());
    hello("world");
    hello("Alex");

  }

  public static void hello(String somebody) {
    System.out.println("Hello, "+somebody+"!");
  }


}