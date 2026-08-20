package fr.fms.job;

import fr.fms.entities.Circle;
import fr.fms.entities.Shape;
import fr.fms.entities.Square;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class IJobImpl implements IJob {

    private final Map<Integer, Shape> shapes;

    public IJobImpl() {
        shapes = new HashMap<>();
    }
    @Override
    public void addShape(int id, Shape shape) {
        shapes.put(id, shape);
    }

    @Override
    public void deleteShape(int id) {
        shapes.remove(id);
    }

    @Override
    public Shape getShapeById(int id) {
        return shapes.get(id);
    }

    @Override
    public void moveShape(int id, int x, int y) {
        Shape shape = shapes.get(id);
        shape.getCenter().setX(x);
        shape.getCenter().setY(y);
    }

    @Override
    public void drawShape(Shape shape, Graphics g) {
        int x = shape.getCenter().getX();
        int y = shape.getCenter().getY();

        if (shape instanceof Square) {

            int side = ((Square) shape).getSide();
            g.fillRect(x - side / 2, y - side / 2, side, side);

        } else if (shape instanceof Circle) {

            double radius = ((Circle) shape).getRadius();
            g.fillOval((int) (x - radius / 2), (int) (y - radius / 2), (int) radius, (int) radius);

        }
    }

    @Override
    public void displayAll() {
        for(Shape s : shapes.values()) {
            System.out.println(s);
        }
    }
}
