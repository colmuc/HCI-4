package program;

import javafx.application.Application;
import javafx.stage.Stage;
public class Main extends Application {

    @Override
    public void start(Stage stage){


        Model model = new Model();
        Controller controller = new Controller(model);
        View view = new View(controller, model);
        view.show();
   }


    public static void main(String[] args) {
        launch(args);
    }
}
