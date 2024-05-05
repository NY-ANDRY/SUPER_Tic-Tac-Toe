import tic_tac_toe.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame fenetre = new JFrame("NICE");
        Super_tic_tac super_ttt = new Super_tic_tac();
        fenetre.add(super_ttt.getPanel());
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setSize(600, 700);
        fenetre.setLocationRelativeTo(null);
        fenetre.setVisible(true);
    }
}