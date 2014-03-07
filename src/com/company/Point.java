package com.company;

public class Point {

    /* объект инициализируется при создании и не изменяется */
    private final double x;
    private final double y;
    public Point(final double xx, final double yy) {
        super();
        x = xx;
        y = yy;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
}


public class LocateLogic {
    public double calculateDistance(
            Point t1, Point t2) {
/* вычисление расстояния */
//        double dx = t1.getX() - t2.getX();
//        double dy = t1.getY() - t2.getY();
//        return Math.hypot(dx, dy);
    }
}


public class Runner {

    public static void main(String[] args) {
// локальные переменные не являются членами класса
        Point t1 = new Point(5, 10);
        Point t2 = new Point(2, 6);
        System.out.print("расстояние равно : "
                + new LocateLogic().calculateDistance(t1, t2));
    }
}