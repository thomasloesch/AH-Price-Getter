import javax.swing.*;
import java.awt.*;

/**
 * Created by tloesch on 4/13/2017.
 */
public class BlizzAPIFrame extends JFrame {
    public BlizzAPIFrame(){

        initUI();
    }

    private void initUI() {
        setTitle("BlizzAPI Tester");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        EventQueue.invokeLater(()-> {
            BlizzAPIFrame ex = new BlizzAPIFrame();
            ex.setVisible(true);
        });

    }
}
