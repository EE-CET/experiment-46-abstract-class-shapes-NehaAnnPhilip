abstract class Shape {
    // TODO: Abstract method numberOfSides()
    // Abstract methods do not have a body
    abstract void numberOfSides();
}

// TODO: Create class Rectangle extends Shape
class Rectangle extends Shape {
    // Implement numberOfSides() to print "Rectangle has 4 sides"
    @Override
    void numberOfSides() {
        System.out.println("Rectangle has 4 sides");
    }
}

// TODO: Create class Triangle extends Shape
class Triangle extends Shape {
    // Implement numberOfSides() to print "Triangle has 3 sides"
    @Override
    void numberOfSides() {
        System.out.println("Triangle has 3 sides");
    }
}

// TODO: Create class Hexagon extends Shape
class Hexagon extends Shape {
    // Implement numberOfSides() to print "Hexagon has 6 sides"
    @Override
    void numberOfSides() {
        System.out.println("Hexagon has 6 sides");
    }
}

public class AbstractShapes {
    public static void main(String[] args) {
        // TODO: Create objects for Rectangle, Triangle, and Hexagon
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        Hexagon h = new Hexagon();
        
        // TODO: Call numberOfSides() for each object
        r.numberOfSides();
        t.numberOfSides();
        h.numberOfSides();
    }
}
