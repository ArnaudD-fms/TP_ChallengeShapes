package fr.fms.graphic;

import fr.fms.entities.Circle;
import fr.fms.entities.Square;
import fr.fms.job.IJob;
import fr.fms.job.IJobImpl;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    IJob job = new IJobImpl();

    public Panel() {
        job.addShape(1, new Square(50, 100, 100));
        job.addShape(2, new Circle(20, 150, 150));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        job.drawShape(job.getShapeById(1), g);
        job.drawShape(job.getShapeById(2), g);
    }
}