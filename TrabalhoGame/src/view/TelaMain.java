package view;

import javax.swing.UIManager;

public class TelaMain {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
            new TelaInicio().setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
