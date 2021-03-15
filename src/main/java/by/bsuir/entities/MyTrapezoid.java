package by.bsuir.entities;

import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;

public class MyTrapezoid extends Figure {

    public MyTrapezoid(int height, int width) {
        this.figureHeight = height;
        this.figureWidth = width;
    }

    @Override
    public Shape draw(int positionX, int positionY) {
        Polygon trapezoid = new Polygon();
        trapezoid.getPoints().addAll(
                positionX - figureWidth / 4, positionY - figureHeight / 2,
                positionX + figureWidth / 4, positionY - figureHeight / 2,
                positionX + figureWidth / 2, positionY + figureHeight / 2,
                positionX - figureWidth / 2, positionY + figureHeight / 2
        );
        trapezoid.setFill(randomColor());
        return trapezoid;
    }

}
