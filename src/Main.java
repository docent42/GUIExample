import javax.swing.*;
import java.awt.*;

public class Main
{
    public static void main(String[] args) {

        JFrame frame = new JFrame("Ввод Ф.И.О.");
        frame.setSize(700,200);

        frame.add(new FIOForm().getMainPanel());

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
