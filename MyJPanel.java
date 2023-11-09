import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class MyJPanel {

    public static void main(String[] arguments) {

	JFrame jframe = new JFrame("JFrame HaGa");
	JPanel myJPanel = new JPanel();
	JButton jButton = new JButton("Ok");

	jframe.add(jButton);

	jframe.setExtendedState(JFrame.MAXIMIZED_BOTH);
	jframe.setVisible(true);
	jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
