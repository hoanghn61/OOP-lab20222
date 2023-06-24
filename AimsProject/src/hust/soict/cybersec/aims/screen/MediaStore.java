package hust.soict.cybersec.aims.screen;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import hust.soict.cybersec.aims.cart.Cart;
import hust.soict.cybersec.aims.exeption.PlayerException;
import hust.soict.cybersec.aims.media.Media;
import hust.soict.cybersec.aims.media.Playable;


@SuppressWarnings("serial")
public class MediaStore extends JPanel {
	
    private Media media;
	public Cart cart;
    public MediaStore(Media media)
    {
        this.media = media;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel title = new JLabel(media.getTitle());
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
        title.setAlignmentX(CENTER_ALIGNMENT);

        JLabel cost = new JLabel("" + media.getCost() + " $");
        cost.setAlignmentX(CENTER_ALIGNMENT);

        JPanel container = new JPanel();
        container.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        JButton btnAdd = new JButton("Add to cart");
        btnAdd.addActionListener(new ButtonListener());
        container.add(btnAdd);
        if (media instanceof Playable)
        {
            JButton btnPlay = new JButton("Play");
            btnPlay.addActionListener(new ButtonListener());
            container.add(btnPlay);
            
        }


        this.add(Box.createVerticalGlue());
        this.add(title);
        this.add(cost);
        this.add(Box.createVerticalGlue());
        this.add(container);

        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }




	private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String button = e.getActionCommand();
            if (button.equals("Play")){
                if (media instanceof Playable){
                    try{
                        ((Playable) media).play();
                    } catch (PlayerException exception){
                        exception.printStackTrace();
                    }
                }
            } else if(button.equals("Add to cart")){
                cart.addMedia(media);
            }
        }
    }
}