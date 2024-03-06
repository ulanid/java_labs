public class Main {
    public static void main(String[] args) {
        double a = Double.parseDouble(System.console().readLine("Enter the side length of the square: "));
        double r = Double.parseDouble(System.console().readLine("Enter the radius of the circle: "));
        
        Shape square = new Square(a);
        Shape circle = new Circle(r);
        
        double squareArea = square.getArea();
        double circleArea = circle.getArea();

        System.out.println("Area of the square: " + squareArea);
        System.out.println("Area of the circle: " + circleArea);
    }
}