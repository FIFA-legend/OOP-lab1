package by.bsuir.entities;

import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class MyRectangle extends Figure {

    public MyRectangle(int height, int width) {
        this.figureHeight = height;
        this.figureWidth = width;
    }

    @Override
    public Shape draw(int positionX, int positionY) {
        double xOffset = figureWidth / 2;
        double yOffset = figureHeight / 2;
        Rectangle rectangle = new Rectangle(positionX - xOffset, positionY - yOffset, figureWidth, figureHeight);
        rectangle.setFill(randomColor());
        return rectangle;
    }

}
