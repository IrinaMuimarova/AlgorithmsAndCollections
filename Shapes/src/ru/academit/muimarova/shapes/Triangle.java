package ru.academit.muimarova.shapes;

public class Triangle implements Shape {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public double getX3() {
        return x3;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public double getY3() {
        return y3;
    }

    public void setY3(double y3) {
        this.y3 = y3;
    }

    @Override
    public double getWidth() {
        double max = Math.max(x1, x2);
        max = Math.max(x3, max);
        double min = Math.min(x1, x2);
        min = Math.min(x3, min);
        return max - min;
    }

    @Override
    public double getHeight() {
        double max = Math.max(y1, y2);
        max = Math.max(y3, max);
        double min = Math.min(y1, y2);
        min = Math.min(y3, min);
        return max - min;
    }

    @Override
    public double getArea() {
        return Math.abs(0.5 * ((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3)));
    }

    @Override
    public double getPerimeter() {
        return getSide(x1, y1, x2, y2) + getSide(x2, y2, x3, y3) + getSide(x3, y3, x1, y1);
    }

    private static double getSide(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    @Override
    public String toString() {
        return "A(" + x1 + ", " + y1 + "), B(" + x2 + ", " + y2 + "), C(" + x3 + ", " + y3 + ").";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Triangle triangle = (Triangle) obj;
        return x1 == triangle.x1 && x2 == triangle.x2 && x3 == triangle.x3
                && y1 == triangle.y1 && y2 == triangle.y2 && y3 == triangle.y3;
    }

    @Override
    public int hashCode() {
        final int prime = 53;
        int hash = 1;
        hash = prime + hash + Double.hashCode(x1);
        hash = prime + hash + Double.hashCode(x2);
        hash = prime + hash + Double.hashCode(x3);
        hash = prime + hash + Double.hashCode(y1);
        hash = prime + hash + Double.hashCode(y2);
        hash = prime + hash + Double.hashCode(y3);
        return hash;
    }
}
