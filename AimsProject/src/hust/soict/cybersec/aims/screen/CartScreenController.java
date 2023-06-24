package hust.soict.cybersec.aims.screen;

import java.awt.Button;
import java.awt.Frame;

import javax.swing.JOptionPane;

import hust.soict.cybersec.aims.cart.Cart;
import hust.soict.cybersec.aims.exeption.PlayerException;
import hust.soict.cybersec.aims.media.Media;
import hust.soict.cybersec.aims.media.Playable;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;

public class CartScreenController {
	private Cart cart;
	

    private Frame storeScreen;
    private Frame currentScreen;
    private Frame addBookScreen;
    private Frame addCDScreen;
    private Frame addDVDScreen;
	
	@FXML
	private TableView<Media> tblMedia;
	
	@FXML
	private TableColumn<Media, String> colMediaTitle;
	
	@FXML
	private TableColumn<Media, String> colMediaCategory;
	
	@FXML
	private TableColumn<Media, Float> colMediaCost;
	
    @FXML
    private RadioButton radioBtnFilterId;
    
    @FXML
    private RadioButton radioBtnFilterTitle;
    
    @FXML
    private ToggleGroup filterCategory;
    
    @FXML
    private TextField tfFilter;
    
    @FXML
    private Label totalCostLabel;
    
    @FXML
    private Button btnPlay;
    
    @FXML
    private Button btnRemove;
	
    @SuppressWarnings("unused")
	private void initialize() {
        colMediaTitle.setCellValueFactory(
                new PropertyValueFactory<Media, String>("title")
        );
        colMediaCategory.setCellValueFactory(
                new PropertyValueFactory<Media, String>("category")
        );
        colMediaCost.setCellValueFactory(
                new PropertyValueFactory<Media, Float>("cost")
        );
        tblMedia.setItems(this.cart.getItemsOrdered());
        
        btnPlay.setVisible(false);
        btnRemove.setVisible(false);
        
        tblMedia.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Media>() {

			@Override
			public void changed(ObservableValue<? extends Media> observable, Media oldValue, Media newValue) {
				if(newValue != null) {
					updateButton(newValue);
				}
				
			}
		});
        
        
        tfFilter.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String oldValue, String newValue) {
                showFilteredMedia(newValue);
            }
        });
            
    }
    void showFilteredMedia(String string) {
        if (radioBtnFilterId.isSelected()){
            tblMedia.setItems(this.cart.searchById(Integer.parseInt(string)));
        } else if (radioBtnFilterTitle.isSelected()){
            tblMedia.setItems(this.cart.searchByTitle(string));
        }
    }
	

		@FXML
	    void onClickPlayBtn(ActionEvent event){
	        Media selectedMedia = tblMedia.getSelectionModel().getSelectedItem();
	        if (selectedMedia instanceof Playable){
	            try {
	                ((Playable) selectedMedia).play();
	            } catch (PlayerException playerException){
	                playerException.printStackTrace();
	            }
	        }
	    }



	void updateButton(Media media) {
		 btnRemove.setVisible(true);
		 if (media instanceof Playable) {
			 btnPlay.setVisible(true);
		 }else {
			 btnPlay.setVisible(false);
		 }
		
		
	}
	 
	    @FXML
	    void btnRemovePressed(ActionEvent event){
	        Media media = tblMedia.getSelectionModel().getSelectedItem();
	        cart.removeMedia(media);
	        
	    }
	    
	    void updateTotalCost(){
	        Platform.runLater(
	                new Runnable() {
	                    @Override
	                    public void run() {
	                        totalCostLabel.setText(String.format("%.2f", cart.totalCost())+ " $");
	                    }
	                }
	        );
	    }
	    
	    @FXML
	    void onPlaceOrder(ActionEvent event){
	        JOptionPane.showMessageDialog(null, "An Order is created", "Cart", JOptionPane.INFORMATION_MESSAGE);
	        cart.emptyCart();
	    }


	    @FXML
	    void onClickAddBook(){
	        currentScreen.setVisible(false);
	        addBookScreen.setVisible(true);
	    }

	    @FXML
	    void onClickAddCD(){
	        currentScreen.setVisible(false);
	        addCDScreen.setVisible(true);
	    }

	    @FXML
	    void onClickAddDVD(){
	        currentScreen.setVisible(false);
	        addDVDScreen.setVisible(true);
	    }

	    @FXML
	    void onClickViewStore(){
	        currentScreen.setVisible(false);
	        storeScreen.setVisible(true);
	    }

	    @FXML
	    void onClickViewCart(){
	       
	    }

}
