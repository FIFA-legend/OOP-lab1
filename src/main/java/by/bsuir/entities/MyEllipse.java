package by.bsuir.entities;

import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Shape;

public class MyEllipse extends Figure {

    private final int xRadius;

    private final int yRadius;

    public MyEllipse(int height, int width, int xRadius, int yRadius) {
        this.figureHeight = height;
        this.figureWidth = width;
        this.xRadius = xRadius;
        this.yRadius = yRadius;
    }

    @Override
    public Shape draw(int positionX, int positionY) {
        Ellipse ellipse = new Ellipse();
        ellipse.setCenterX(positionX);
        ellipse.setCenterY(positionY);
        ellipse.setRadiusX(xRadius);
        ellipse.setRadiusY(yRadius);
        ellipse.setFill(randomColor());
        return ellipse;
    }

}
