package com.company;

public class Main {

    public static void main(String[] args) {
        Figure circle = create0bject(Circle.class.getName());
        Figure square = create0bject(Square.class.getName());
        Figure triangle = create0bject(Triangle.class.getName());

        circle.print();
        square.print();
        triangle.print();
    }

    public static Figure create0bject(String className) {
        if (className == Circle.class.getName()) {
            return new Circle();
        } else if (className == Square.class.getName()) {
            return new Square();
        } else {
            return new Triangle();
        }
    }
}