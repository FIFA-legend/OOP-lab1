package by.bsuir.entities;

import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;

public class MyTriangle extends Figure {

    public MyTriangle(int height, int width) {
        this.figureHeight = height;
        this.figureWidth = width;
    }

    @Override
    public Shape draw(int positionX, int positionY) {
        Polygon triangle = new Polygon();
        triangle.getPoints().addAll((double) positionX, positionY - figureHeight / 2,
                positionX + figureWidth / 2, positionY + figureHeight / 2,
                positionX - figureWidth / 2, positionY + figureHeight / 2);
        triangle.setFill(randomColor());
        return triangle;
    }

}
