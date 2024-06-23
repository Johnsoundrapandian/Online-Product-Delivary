interface  Shape{
    double calculateArea();


}
class Circle implements  Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    public double calculateArea(){
        double area = 2*3.14*Math.pow(radius,2);
        return area;

    }
    void shape(){
        System.out.println("Circle shape .....");
    }
}
 class Square implements Shape{
    double side;
    Square(double side){
        this.side = side;
    }

    public double calculateArea(){
        double area = Math.pow(side,2);
        return area;
    }
    void shape(){
        System.out.println("Square shape........");
    }
}
class Rectangle implements Shape{
    double side1,side2;
    Rectangle(double side1,double side2){
        this.side1 = side1;
        this.side2 = side2;
    }
    public double calculateArea(){
        double area = 2*side1*side2;
        return area;
    }
}
public class AbstractClass {
    public static void main(String[] args){
        Shape circle = new Circle(5);
        double circleArea = circle.calculateArea();
        System.out.println(circleArea);
        Shape  square = new Square(4);
        double squareArea = square.calculateArea();
        System.out.println(squareArea);
        Shape rectangle = new Rectangle(4,2);
        double rectangleArea = rectangle.calculateArea();
        System.out.println(rectangleArea);

    }
}
