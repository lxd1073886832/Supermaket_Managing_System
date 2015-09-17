package GUI;

import java.awt.*;

import javax.swing.*;

public class Administrator extends JFrame{

	public Administrator(){
		getContentPane().setLayout(null);
		
		JLabel »¶Ó­ = new JLabel("\u6B22\u8FCE\u60A8\uFF0C\u7BA1\u7406\u5458\uFF01");
		»¶Ó­.setFont(new Font("ËÎÌå", Font.PLAIN, 30));
		»¶Ó­.setHorizontalAlignment(SwingConstants.CENTER);
		»¶Ó­.setBounds(117, 10, 401, 41);
		getContentPane().add(»¶Ó­);
		setVisible(true);
		setResizable(false);
		
	}
}
