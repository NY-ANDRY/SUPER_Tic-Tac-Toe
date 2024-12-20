import com.formdev.flatlaf.themes.FlatMacLightLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;

import tic_tac_toe.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        if (args.length > 0) {
            FlatMacDarkLaf.setup();
        } else {
            FlatMacLightLaf.setup();
        }
        JFrame fenetre = new JFrame("Super Tic");
        Super_tic_tac super_ttt = new Super_tic_tac();
        fenetre.add(super_ttt.getPanel());
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setSize(600, 700);
        fenetre.setLocationRelativeTo(null);
        fenetre.setVisible(true);
    }
}