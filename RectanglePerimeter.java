
class RectanglePerimeter {
    double length;
    double breadth;

    public RectanglePerimeter(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }

    public static void main(String[] args) {
         RectanglePerimeter rectangle = new RectanglePerimeter(10, 5);
        double perimeter = rectangle.calculatePerimeter();
        System.out.println("Perimeter of rectangle: " + perimeter);
    }
}