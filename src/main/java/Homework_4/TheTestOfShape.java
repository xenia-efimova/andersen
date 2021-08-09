package Homework_4;

public class TheTestOfShape {

    public static void main(String[] args) {
        Rectangle Rectrect=new Rectangle(7, 4);
        System.out.println("Стороны прямоугольника равны: 7, 4");
        System.out.println("Периметр прямоугольника составляет: "+Rectrect.getCircumference());
        System.out.println("Площадь прямоугольника составляет: "+Rectrect.getArea());

        Circle circle=new Circle(12);
        System.out.println("\nРадиус круга равен: 12");
        System.out.println("Периметр круга равен: "+circle.getCircumference());
        System.out.println("Площадь круга равна: "+circle.getArea());

        Triangle triangleTest=new Triangle(5,7,9);
        System.out.println("\nСтороны треугольника равны: 5, 7, 9");
        System.out.println("Периметр треугольника равен: "+triangleTest.getCircumference());
        System.out.println("Площадь треугольника равна: "+triangleTest.getArea());
    }

}