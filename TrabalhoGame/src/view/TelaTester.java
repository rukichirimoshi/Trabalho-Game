package view;

import javax.swing.UIManager;

public class TelaTester {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
            new TelaInicio().setVisible(true);
            ;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
