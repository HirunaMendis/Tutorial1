import javax.swing.*;

public class Window {

    public static void main(String[] args){

        JFrame box = new JFrame("My First Frame");
        box.setSize(300, 200);

        box.setLocation(100, 50);
        box.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        box.setVisible(true);

    }
}
