package GUI;

import java.awt.*;

import javax.swing.*;

public class Administrator extends JFrame{

	public Administrator(){
		getContentPane().setLayout(null);
		
		JLabel ��ӭ = new JLabel("\u6B22\u8FCE\u60A8\uFF0C\u7BA1\u7406\u5458\uFF01");
		��ӭ.setFont(new Font("����", Font.PLAIN, 30));
		��ӭ.setHorizontalAlignment(SwingConstants.CENTER);
		��ӭ.setBounds(117, 10, 401, 41);
		getContentPane().add(��ӭ);
		setVisible(true);
		setResizable(false);
		
	}
}
