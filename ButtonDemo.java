import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ButtonDemo {
    ButtonDemo() {
        JFrame jfrm = new JFrame();
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setSize(420, 420);
        jfrm.setLayout(new FlowLayout());

        ImageIcon icon = new ImageIcon("kekw.png");
        jfrm.setIconImage(new ImageIcon("kekw.png").getImage());

        JButton alpha = new JButton("Alpha");
        JButton beta = new JButton("Beta");
        JButton reset = new JButton("Reset");


        JLabel jlab = new JLabel("Press any button.");
        jlab.setIcon(icon);
        jlab.setHorizontalAlignment(SwingConstants.CENTER);
        jlab.setVerticalAlignment(SwingConstants.CENTER);

        alpha.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jlab.setText("Alpha was pressed.");
            } 
        });

        beta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jlab.setText("Beta was pressed.");
            } 
        });

        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jlab.setText("Press any button.");
            } 
        });

        jfrm.add(jlab);
        jfrm.add(alpha);
        jfrm.add(beta);
        jfrm.add(reset);

        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ButtonDemo();
            }
        });
    }
}