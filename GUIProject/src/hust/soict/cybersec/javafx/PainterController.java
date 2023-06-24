package hust.soict.cybersec.javafx;




import java.awt.Color;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

public class PainterController {
	
	private Color colorToWrite;
    @FXML
    private Pane drawingAreaPane;

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
    	Circle newCircle = new Circle(event.getX(), event.getY(), 4);
    	drawingAreaPane.getChildren().add(newCircle);
    }
    
    void switchToPen(ActionEvent event) {
    	this.colorToWrite = Color.BLACK;
    }
    
    void switchToEraser(ActionEvent event) {
    	this.colorToWrite = Color.WHITE;
    	
    }

    @FXML
    void clearButtonPressed(ActionEvent event) {
    	drawingAreaPane.getChildren().clear();

    }
    
    @FXML
    private RadioButton penBtn;

    @FXML
    private RadioButton eraserBtn;

}
