package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller
{
    @FXML
    private Label coffeeLabel;
    @FXML
    private Button changeButton;
    
    private String currentPath;
    private String freshPath;
    private String hotPath;
    
    private Alert alert;
    
    public Controller() {
        freshPath = "file:src/images/fresh_coffee.gif";
        hotPath = "file:src/images/hot_coffee.gif";
        currentPath = "";
        
//        alert = new Alert(Alert.AlertType.WARNING);
        alert = new Alert((Alert.AlertType.INFORMATION));
        alert.setContentText("Hot Coffee");
    }
    
    
    @FXML
    public void changeImage()
    {
        currentPath = currentPath.equals(hotPath) ? freshPath : hotPath;
        coffeeLabel.setGraphic(new ImageView(new Image(currentPath, 300, 300, true, true)));
        
        alert.show();
    }
}
