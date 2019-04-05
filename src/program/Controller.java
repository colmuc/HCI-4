package program;

import javafx.animation.ParallelTransition;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.Node;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.util.Duration;


public class Controller {
    private Model model;

    Controller(Model model) {
        this.model = model;
    }

 public EventHandler moveClicked(Node shape){
        return (event)->{
            final TranslateTransition translate = new TranslateTransition(
                    Duration.millis( 5000 ), shape );
            translate.byXProperty().set( 400.0 );
            translate.setAutoReverse( true );
            translate.setCycleCount( TranslateTransition.INDEFINITE );
            final RotateTransition rotate = new RotateTransition(
                    Duration.seconds( 1.0 ), shape );
            rotate.setByAngle( 360.0 );
            rotate.setCycleCount( RotateTransition.INDEFINITE );
            final ParallelTransition pt = new ParallelTransition( translate, rotate );
            pt.play();
        };
 }
    public EventHandler infoClicked(Label info) {
        return (event)-> {
            info.setText(model.getInfo());
        };
    }
}
