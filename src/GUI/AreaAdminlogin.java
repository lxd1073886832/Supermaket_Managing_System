package GUI;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class AreaAdminlogin extends JFrame {

	public AreaAdminlogin() 
	{
		setTitle("�������Ա");
		setResizable(false);
		 new JFrame();
		setBounds(100, 100, 484, 310);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		getContentPane().setLayout(null);
		
		JLabel �������Ա��¼ = new JLabel("\u533A\u57DF\u7BA1\u7406\u5458\u767B\u5F55");
		�������Ա��¼.setBounds(86, 20, 282, 37);
		�������Ա��¼.setHorizontalAlignment(SwingConstants.CENTER);
		�������Ա��¼.setFont(new Font("����", Font.PLAIN, 30));
		getContentPane().add(�������Ա��¼);
		
		JLabel �û��� = new JLabel("\u7528\u6237\u540D");
		�û���.setBounds(49, 83, 101, 29);
		�û���.setHorizontalAlignment(SwingConstants.CENTER);
		�û���.setFont(new Font("����", Font.PLAIN, 20));
		getContentPane().add(�û���);
		
		 JTextField �û�������;
		 JTextField ��������;

		�û������� = new JTextField();
		�û�������.setBounds(170, 85, 198, 29);
		getContentPane().add(�û�������);
		�û�������.setColumns(10);
		
		JLabel ���� = new JLabel("\u5BC6\u7801");
		����.setBounds(49, 141, 101, 29);
		����.setHorizontalAlignment(SwingConstants.CENTER);
		����.setFont(new Font("����", Font.PLAIN, 20));
		getContentPane().add(����);
		
		�������� = new JTextField();
		��������.setBounds(170, 143, 198, 29);
		��������.setColumns(10);
		getContentPane().add(��������);
		
		JButton ȷ�� = new JButton("\u786E\u8BA4");
		ȷ��.setBounds(59, 198, 136, 43);
		ȷ��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new AreaAdminlogin();
			}
		});
		ȷ��.setFont(new Font("����", Font.PLAIN, 24));
		getContentPane().add(ȷ��);
		
		JButton ȡ�� = new JButton("\u53D6\u6D88");
		ȡ��.setBounds(264, 200, 136, 43);
		ȡ��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new login().setVisible(true);
			}
		});
		ȡ��.setFont(new Font("����", Font.PLAIN, 24));
		getContentPane().add(ȡ��);
	}

}
