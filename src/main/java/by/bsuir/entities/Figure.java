package by.bsuir.entities;

import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;

abstract public class Figure {

    protected double figureHeight;

    protected double figureWidth;

    public abstract Shape draw(int positionX, int positionY);

    protected Color randomColor() {
        return Color.color(Math.random(), Math.random(), Math.random());
    }

}
