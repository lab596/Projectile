import javax.swing.JFrame;

public class Frame extends JFrame {
    
    public Frame(){
        this.add(new Panel());
        this.setTitle("Projectile Launcher");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
    }
}
