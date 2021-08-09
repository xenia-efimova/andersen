package Homework_4;

public class Rectangle extends Shape {

    private double  a;
    private double  b;

    public Rectangle(double a,double b) {
        this.a=a;
        this.b=b;
    }

    public double getCircumference() {
        return 2*(a+b);
    }
    public double getArea() {
        return a*b;
    }
    public double getGirth() {
        return 0;
    }
}