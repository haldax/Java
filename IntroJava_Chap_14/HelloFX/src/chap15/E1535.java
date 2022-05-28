/* 
(Animation: self-avoiding random walk) Revise the preceding exercise to display
the walk step by step in an animation, as shown in Figures 15.39c and d.
}
*/

package chap15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;


public class E1535 extends Application {
    @Override
    public void start(Stage primaryStage) {
        VBox pane = new VBox();
        pane.setAlignment(Pos.CENTER);

        HBox panel = new HBox(10);
        panel.setPadding(new Insets(10,10,10,10));
        panel.setAlignment(Pos.CENTER);

        Button start = new Button("Start");
        Button resetButton = new Button("Reset");
        panel.getChildren().addAll(start, resetButton);

        RandomWalkPane randomWalk = new RandomWalkPane();

        pane.getChildren().addAll(randomWalk, panel);
        start.setOnAction(e -> randomWalk.walk());
        resetButton.setOnAction(e -> randomWalk.reset());

        //start.setOnAction(e -> machine.restart());
        
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Rnadom walk simulate");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    public static void main(String[] args ){
        launch(args);
    }
}