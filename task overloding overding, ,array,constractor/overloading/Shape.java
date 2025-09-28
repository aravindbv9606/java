class Shape {
    public void area(int side) {
        System.out.println("Area of square: " + (side * side));
    }

    public void area(int length, int breadth) {
        System.out.println("Area of rectangle: " + (length * breadth));
    }

    public void area(double radius) {
        System.out.println("Area of circle: " + (3.14 * radius * radius));
    }
}
