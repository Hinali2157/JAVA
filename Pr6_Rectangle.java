
public class Pr6_Rectangle {

    double height, width, area, perimeter;

    // a no-argument constructor
    Pr6_Rectangle() {
        height = 1;
        width = 1;
    }
    //  parameter constructor

    Pr6_Rectangle(double w, double h) {
        height = h;
        width = w;
    }

    double getArea() {
        area = (height) * (width);
        System.out.println("the area of rectangle with get area is : " + area);
        return (area);
    }

    double getPerimeter() {
        perimeter = 2 * (width + height);
        System.out.println("the perimeter of the rectangle is : " + (2 * (width + height)));
        return (perimeter);
    }

    public static void main(String[] args) {
        Pr6_Rectangle r = new Pr6_Rectangle(8, 4);
        r.getArea();
        r.getPerimeter();
    }
}
