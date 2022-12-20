import java.util.Scanner;
//hierarchial inheritance
//3
class Shape{
    double d;
    Shape(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value");
        d = s.nextDouble();
    }
}
class Circle extends Shape{
    double area,perimeter;
    void calculate(){
        double area = 3.14 * d * d;
        double perimeter = 2 * 3.14 * d;
        System.out.println("Area of Circle = " + area);
        System.out.println("Perimeter of Circle = " + perimeter);
    }
}
class Square extends Shape{
    double area,perimeter;
    void calculate(){
        double area = d * d;
        double perimeter = 4 * d;
        System.out.println("Area of square = " + area);
        System.out.println("Perimeter of square = " + perimeter);
    }
}
class Sphere extends Shape{
    double surfarea,volume;
    void calculate(){
        double surfarea = 4 * 3.14 * d * d;
        double volume = (4/3) * 3.14 * d * d * d;
        System.out.println("Surface area of sphere = " + surfarea);
        System.out.println("Volume of sphere = " + volume);
    }
}
class Shapes{
    public static void main(String[] args){
        Circle a1 = new Circle();
        System.out.println("For circle class");
        a1.calculate();
        Square a2 = new Square();
        System.out.println("For square class");
        a2.calculate();
        Sphere a3 = new Sphere();
        System.out.println("For sphere class");
        a3.calculate();
    }
}
