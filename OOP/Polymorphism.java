package OOP.Tasks;

public class Polymorphism {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle();
        shapes[1] = new Square();
        shapes[2] = new Triangle();

        for (Shape shape: shapes) {
            shape.draw();
        }

    }
}

class Shape {
    void draw(){
        System.out.println("Drawing a generic shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing a square");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Drawing a triangle");
    }
}

