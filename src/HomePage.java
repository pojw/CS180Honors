import javax.swing.*;
import java.awt.*;

public class HomePage extends JComponent implements Runnable {
    JButton CNN;
    JButton RL;
    JButton SL;
    JButton TRAN;
    JButton UL;
   JButton easy;
   JButton hard;
    JLabel status;
    JLabel info;
    String model;
    String type;

    public static void main(String[] args){
        SwingUtilities.invokeLater(new HomePage());
    }

    public void run() {
        JFrame frame = new JFrame();
        frame.setTitle("AI Learning");
        Container content = frame.getContentPane();
        content.setLayout(new BorderLayout());

        CNN = new JButton("CNN");
        RL = new JButton("RL");
        SL = new JButton("SL");
        TRAN = new JButton("Transformer");
        UL = new JButton("UL");

        JPanel panel = new JPanel();
        JLabel info = new JLabel("Aspect");
        panel.add(info);
        panel.add(CNN);
        panel.add(RL);
        panel.add(SL);
        panel.add(TRAN);
        panel.add(UL);

        content.add(panel,BorderLayout.SOUTH);

        JPanel panel2 = new JPanel();
        status = new JLabel("Mode");
        hard = new JButton("Hard");
        easy = new JButton("Easy");
        panel2.add(status);

        panel2.add(easy);
        panel2.add(hard);


        content.add(panel2,BorderLayout.CENTER);




        frame.setSize(1000, 800);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}