package ua.stqa.educative.sandbox;

public class HelloWorld {

  public static void main(String[] args) {
    hello("world");

    double len = 6;
    System.out.println("Площадь квадрата со стороной " + len + " = " + area(len));
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

  public static double area(double l) {
    return l * l;
  }
}