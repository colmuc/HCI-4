package program;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Controller {
    private Model model;

    Controller(Model model) {
        this.model = model;
    }

    public void infoButtonClicked(ActionEvent event) {
        model.setInfo();
    }
}
