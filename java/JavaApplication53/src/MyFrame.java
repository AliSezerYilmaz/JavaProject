import javax.swing.*;
import java.awt.*;
import javax.swing.JOptionPane;

public class MyFrame extends JPanel {

    private int input;
    public MyFrame(int choice) {
        input = choice;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < 10; i++) {
            switch (input) {
                case 1:
                    g.drawRect(10+i*10, 10+i*10, 50+i*10, 50+i*10);
                    break;
                case 2:
                    g.drawOval(10+i*10, 10+i*10, 50+i*10, 50+i*10);
                    break;



            }
        }
    }






    public static void main(String[] args) {
         int genislik,yukseklik;


        genislik = Integer.parseInt(JOptionPane.showInputDialog("Genişlik giriniz."));
        yukseklik = Integer.parseInt(JOptionPane.showInputDialog(null,"Yükseklik giriniz: ", JOptionPane.INFORMATION_MESSAGE));

        String choice = JOptionPane.showInputDialog("Dikdörtgen için 1 girin. \n"+"Daire için 2 girin.");
        MyFrame shapes = new MyFrame(Integer.parseInt(choice));
        JFrame frame = new JFrame("MyFrame");
        frame.setSize(genislik, yukseklik);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(shapes);
        frame.setVisible(true);





    }
}