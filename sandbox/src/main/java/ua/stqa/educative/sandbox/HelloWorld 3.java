package ua.stqa.educative.sandbox;

import java.sql.SQLOutput;

public class HelloWorld {
<<<<<<< HEAD
  public static void main(String[] args) {
    hello("world");
    hello("guys");
    hello("everybody");

    double l = 5;
    System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));

    double a = 4;
    double b = 3;
    System.out.println("Площадь триугольника со сторонами " + a + " и " + " b = " + area(a, b));
  }

  public static void hello(String somebody) {
    System.out.println("Hello " + somebody + "!");
  }

  public static double area(double len) {
    return len * len;
  }

  public static double area(double a, double b) {
    return a * b;
  }
=======
    public static void main(String[] args) {
        System.out.println("Hello, World");
    }
>>>>>>> parent of caa0383... Создана функция
}