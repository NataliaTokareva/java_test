package ru.stqa.pft.sandbox;

public class myFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Natasha");

    Square s = new Square(5);


    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);


    System.out.println("Площадь квадрата со сторонами " + r.a + " и " + r.b + " = " + r.area());


//функция вывода с атрибутами которая использует функцию вычисления расстояния
    Point p = new Point(20, 16);
  //  p.p1 = 20;
   // p.p2 = 16;


  //  System.out.println("Расстояние между двумя точками на плоскости c координатами " + p.p1 + " и " + p.p2 +  " = " + distance(p));

    //метод
    System.out.println("Расстояние между двумя точками на плоскости c координатами " + p.p1 + " и " + p.p2 +  " = " + p.distance());


  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

  public static double area(Rectangle r) {
    return r.a * r.b;
  }
//функция вычисления расстояния
 // public static double distance(Point p) {
  //  return Math.sqrt(p.p1 + p.p2);

  //}

}