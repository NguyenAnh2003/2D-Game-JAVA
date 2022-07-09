import javax.swing.JFrame;

public class main {
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    frame.add(new GamePanel());
    frame.pack();
    frame.setVisible(true);
    frame.setLocationRelativeTo(null);
  }
}
