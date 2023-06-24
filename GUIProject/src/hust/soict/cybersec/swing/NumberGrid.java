package hust.soict.cybersec.swing;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberGrid extends JFrame {
    private JButton[] btnNumber = new JButton[10];
    private JButton btnDelete;
    private JButton btnReset;
    private JTextField tfDisplay;

    public NumberGrid() {
        tfDisplay = new JTextField();
        tfDisplay.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        JPanel panelButton = new JPanel(new GridLayout(4, 3));
        addButtons(panelButton);

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(tfDisplay, BorderLayout.NORTH);
        cp.add(panelButton, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Number Gird");
        setSize(200, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new NumberGrid();
    }

    protected void addButtons(JPanel panelButtons) {
        ButtonListener btnListener = new ButtonListener();
        for (int i = 1; i <= 9 ; i++) {
            btnNumber[i] = new JButton("" + i);
            panelButtons.add(btnNumber[i]);
            btnNumber[i].addActionListener(btnListener);
        }

        btnDelete = new JButton("DEL");
        panelButtons.add(btnDelete);
        btnDelete.addActionListener(btnListener);

        btnNumber[0] = new JButton("0");
        panelButtons.add(btnNumber[0]);
        btnNumber[0].addActionListener(btnListener);

        btnReset = new JButton("C");
        panelButtons.add(btnReset);
        btnReset.addActionListener(btnListener);
    }

    private class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String button = e.getActionCommand();
            if (button.charAt(0) >= '0' && button.charAt(0) <= '9'){
                tfDisplay.setText(tfDisplay.getText() + button);
            } else if (button.equals("DEL")) {
                tfDisplay.setText("" + tfDisplay.getText().substring(0, tfDisplay.getText().length() - 1));
            }else {
                tfDisplay.setText("");
            }
        }
    }
}