package by.bsuir;

import by.bsuir.entities.*;
import by.bsuir.linkedList.MyLinkedList;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class MainWindowController {

    private static final MyLinkedList<Figure> figures;

    static {
        figures = new MyLinkedList<>();
        figures.insert(new MyTriangle(50, 50));
        figures.insert(new MyRectangle(25, 50));
        figures.insert(new MyTrapezoid(50, 50));
        figures.insert(new MySquare(50));
        figures.insert(new MySquare(50));
        figures.insert(new MyCircle(50, 25));
        figures.insert(new MyTrapezoid(50, 50));
        figures.insert(new MyEllipse(50, 50, 25, 15));
        figures.insert(new MyRectangle(25, 50));
        figures.insert(new MyEllipse(50, 50, 25, 15));
        figures.insert(new MySquare(50));
        figures.insert(new MyTrapezoid(50, 50));
        figures.insert(new MyTriangle(50, 50));
        figures.insert(new MySquare(50));
        figures.insert(new MyCircle(50, 25));
        figures.insert(new MyEllipse(50, 50, 25, 15));
    }

    @FXML
    private AnchorPane placeToDraw;

    @FXML
    void initialize() {
        int linesCount = 0;
        int line = 50;
        for (int i = 0; i < figures.getLength(); i++) {
            if ((i + 1) * 70 / 800 > linesCount) {
                line += 100;
                linesCount++;
            }
            placeToDraw.getChildren()
                    .add(figures.get(i).draw((i + 1) * 70 % 800, line));
        }
    }

    /*public static MyLinkedList<Figure> createList() {
        MyLinkedList<Figure> figures = new MyLinkedList<>();
        figures.insert(new MyTriangle(50, 50));
        figures.insert(new MyRectangle(50, 50));
        figures.insert(new MyTrapezoid(50, 50));
        figures.insert(new MySquare(50, 50));
        figures.insert(new MySquare(50, 50));
        figures.insert(new MyCircle(50, 50));
        figures.insert(new MyTrapezoid(50, 50));
        figures.insert(new MyEllipse(50, 50));
        figures.insert(new MyRectangle(50, 50));
        figures.insert(new MyEllipse(50, 50));
        figures.insert(new MySquare(50, 50));
        figures.insert(new MyTrapezoid(50, 50));
        figures.insert(new MyTriangle(50, 50));
        figures.insert(new MySquare(50, 50));
        figures.insert(new MyCircle(50, 50));
        figures.insert(new MyEllipse(50, 50));
        return figures;
    }*/
}
