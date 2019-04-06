package program;

import javafx.animation.ParallelTransition;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

import javafx.scene.layout.VBox;

import javafx.scene.shape.Rectangle;

import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.util.Duration;


import java.awt.*;

public class View extends Stage {
    private Controller controller;
    private Model model;


    View(Controller controller, Model model ){
        this.model = model;
        this.controller=controller;
        this.setTitle("Fitts Law");
        this.setScene(createScene());


    }


    private Scene createScene(){
                Scene scene = new Scene(createBox(), 600,500);
        return scene;
    }


    private VBox createBox(){
        Button buttonInfo = new Button( "Info" );
        buttonInfo.setPrefSize(100,20);
        Button buttonMove = new Button ("move");
        buttonMove.setPrefSize(100,20);
        Label infoLabel = new Label();
        Label message =  new Label();
        Node shape = rectangle();
        LineChart chart = createChart();

        buttonInfo.setOnAction(controller.infoClicked(infoLabel));
        buttonMove.setOnAction(controller.moveClicked(shape));
        shape.setOnMouseClicked(event->controller.mouseClicked(shape,event.getSceneX(),event.getSceneY(), message));

        //This portion is a slightly modified version of the sample code from class

        final Pane pane = new HBox( buttonInfo, buttonMove );
        ((HBox) pane).setSpacing(10);
        pane.setPadding( new Insets( 15, 12, 15, 12 ) );
        VBox box = new VBox(pane, infoLabel, shape,message, chart);
        box.setSpacing(10);
        return box;
    }

    private Node rectangle(){
        Node rectangle = new Rectangle(40,40, Color.CYAN);
        return rectangle;
    }

    private Node ellipse(){
        return null;
    }

    private Node circle(){
        return null;
    }

    private LineChart createChart(){
        final LineChart chart = new LineChart<Number,Number>(
                new NumberAxis( "X", 0.0, 400.0, 20.0 ),
                new NumberAxis( "Y", 0.0, 500.0, 20.0 ) );
        chart.setTitle( "Successful Hits" );
        chart.setAnimated( false );
        chart.setLegendVisible( false );
        return chart;
    }

   // private Node createNewShape(){

   //     return shape;
    //}



}
