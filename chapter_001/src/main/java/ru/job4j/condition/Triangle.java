package ru.job4j.condition;

/**
 * Class Triangle - Условный оператор.
 * @author Evgeny Popov
 * @since 1.0
 */

public class Triangle {
private Point a;
private Point b;
private Point c;

/**
* Конструктор.
* @param a - a первая переменная.
* @param b - b вторая переменная.
* @param c - c третья переменная.
*/
public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
}

/**
* Высчитываем площадь треугольнка по формуле Герона.
*/
public double area() {
  double square;
  square = 0.5 * ((b.getX() - a.getX()) * (c.getY() - a.getY()) - (b.getY() - a.getY()) * (c.getX() - a.getX()));
  return Math.abs(square);
}

}