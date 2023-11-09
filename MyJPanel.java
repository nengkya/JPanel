import javax.swing.JPanel;
import javax.swing.JFrame;

public class MyJPanel {

    public static void main(String[] arguments) {

	JFrame jframe = new JFrame("JFrame HaGa");
	JPanel myJPanel = new JPanel();

	jframe.setExtendedState(JFrame.MAXIMIZED_BOTH);
	jframe.setVisible(true);
	jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
