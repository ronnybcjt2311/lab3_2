import javax.swing.*;

public class main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        login loginPanel = new login();
        frame.setContentPane(loginPanel.getMainPanel());
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
