JFrame vs JPanel.

import javax.swing.JPanel;  
JFrame.setVisible(true);  
JPanel doesnt have setVisible();

JPanel myJPanel = new JPanel();  
/* error : incompatible types : JFrame cannot be converted to JPanel */  
JPanel myJPanel1 = new JFrame();
