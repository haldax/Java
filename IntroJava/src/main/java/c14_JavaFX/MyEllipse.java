package c14_JavaFX;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;

/* Defining MyEllipse class for two reasons:
    1. code can be reused
    2. it extends the pane class, when the stage is resized, the contents can be resized along witht the stage

    - the new class overrides setWidth and setHeight methods (in superclass Region)
    - when sstage is resized, setWidth and setHeight is automatically invoked
    - the stroke, rotation is invoked constantly*/
class MyEllipse extends Pane {
    private void paint() {
        getChildren().clear();
        for (int i = 0; i < 16; i++) {
            Ellipse e1 = new Ellipse(getWidth() / 2, getHeight() / 2, getWidth() / 2 - 50, getHeight() / 2 - 50);
            e1.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
            e1.setFill(Color.WHITE);
            e1.setRotate(i * 180.0 / 16);
            getChildren().add(e1);
        }
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        paint();
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        paint();
    }
}
