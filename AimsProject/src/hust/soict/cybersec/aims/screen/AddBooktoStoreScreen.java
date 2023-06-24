package hust.soict.cybersec.aims.screen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import hust.soict.cybersec.aims.media.Book;
import hust.soict.cybersec.aims.media.DigitalVideoDisc;
import hust.soict.cybersec.aims.store.Store;
import hust.soict.cybersec.aims.cart.Cart;

@SuppressWarnings("serial")
public class AddBooktoStoreScreen extends AddItemToStoreScreen{
    private JTextField tfAuthors;

    @Override
    public JPanel createCenter(){
        JPanel center = new JPanel(new GridLayout(5,2, 2,2));
        JLabel lblTitle = new JLabel("Title");
        JLabel lblCategory = new JLabel("Category");
        JLabel lblCost = new JLabel("Cost");
        JLabel lblAuthors = new JLabel("Authors (divided by commas)");

        tfTitle = new JTextField(15);
        tfCategory = new JTextField(15);
        tfCost = new JTextField(15);
        tfAuthors = new JTextField(15);

        center.add(lblTitle); center.add(tfTitle);
        center.add(lblCategory); center.add(tfCategory);
        center.add(lblCost); center.add(tfCost);
        center.add(lblAuthors); center.add(tfAuthors);

        JButton createBtn = new JButton("Add Book");
        createBtn.addActionListener(new ButtonListener());
        center.add(createBtn);

        JButton clearFieldBtn = new JButton("Clear fields");
        clearFieldBtn.addActionListener(new ButtonListener());
        center.add(clearFieldBtn);

        return center;
    }

    public class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String button = e.getActionCommand();
            if (button.equals("Add Book")){
                String title = tfTitle.getText();
                String category = tfCategory.getText();
                float cost = Float.parseFloat(tfCost.getText());
                List<String> authors = List.of(tfAuthors.getText().split(","));

                store.addMedia(new Book(title, category, cost, authors));

                this.clearFields();
            }else if (button.equals("Clear fields")){
                this.clearFields();
            }
        }

        public void clearFields(){
            tfTitle.setText("");
            tfCategory.setText("");
            tfAuthors.setText("");
            tfCost.setText("");
        }
    }

    public AddBooktoStoreScreen(Store store){
        super(store);
        setCurrentScreen(this);
        setAddBookScreen(this);
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(createCenter(), BorderLayout.CENTER);

        setVisible(false);
        setTitle("Add Book Screen");
        setSize(1024, 768);
    }

    public static void main(String[] args) {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation", "Guy Ritchie", 77,18.99f);
        Store store = new Store();
        Cart cart = new Cart();
        store.addMedia(dvd1, dvd2, dvd3);

        new AddBooktoStoreScreen(store);
        new AddDigitalVideoDiscToStoreScreen(store);
        new AddCompactDiscToStoreScreen(store);
        new CartScreen(cart);
    }

}