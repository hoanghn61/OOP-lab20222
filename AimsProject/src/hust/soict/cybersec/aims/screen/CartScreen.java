package hust.soict.cybersec.aims.screen;

import java.io.IOException;

import javax.swing.JPanel;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import hust.soict.cybersec.aims.cart.Cart;

@SuppressWarnings("serial")
public class CartScreen extends AddItemToStoreScreen {
	public CartScreen(Cart cart) {
		super();
	    
		JFXPanel fxPanel = new JFXPanel();
		this.add(fxPanel);
		
		this.setTitle("Cart");
		this.setVisible(true);
		Platform.runLater(new Runnable() {
			
			@Override
			public void run() {
				try {
					FXMLLoader loader = new FXMLLoader(getClass().getResource("hust/soict/cybersec/aims/screen/fxml/cart.fxml"));
					

                    Parent root = loader.load();
                    fxPanel.setScene(new Scene(root));
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        });
    }

	@Override
	JPanel createCenter() {
		// TODO Auto-generated method stub
		return null;
	}
}
