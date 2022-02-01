package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.Triangle;
import edu.eci.cvds.patterns.shapes.concrete.Quadrilateral;
import edu.eci.cvds.patterns.shapes.concrete.Pentagon;
import edu.eci.cvds.patterns.shapes.concrete.Hexagon;

public class ShapeFactory {
    public static Shape create(RegularShapeType shapeType){
        Shape shape;
        switch (shapeType){
            case Triangle: shape = new Triangle();
                break;
            case Quadrilateral: shape = new Quadrilateral();
                break;
            case Pentagon: shape = new Pentagon();
                break;
            case Hexagon: shape = new Hexagon();
                break;
            default: shape = new Triangle();
        }
        return shape;
    }
}