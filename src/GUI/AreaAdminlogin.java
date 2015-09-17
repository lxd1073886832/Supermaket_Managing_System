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
		setTitle("区域管理员");
		setResizable(false);
		 new JFrame();
		setBounds(100, 100, 484, 310);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		getContentPane().setLayout(null);
		
		JLabel 区域管理员登录 = new JLabel("\u533A\u57DF\u7BA1\u7406\u5458\u767B\u5F55");
		区域管理员登录.setBounds(86, 20, 282, 37);
		区域管理员登录.setHorizontalAlignment(SwingConstants.CENTER);
		区域管理员登录.setFont(new Font("宋体", Font.PLAIN, 30));
		getContentPane().add(区域管理员登录);
		
		JLabel 用户名 = new JLabel("\u7528\u6237\u540D");
		用户名.setBounds(49, 83, 101, 29);
		用户名.setHorizontalAlignment(SwingConstants.CENTER);
		用户名.setFont(new Font("宋体", Font.PLAIN, 20));
		getContentPane().add(用户名);
		
		 JTextField 用户名输入;
		 JTextField 密码输入;

		用户名输入 = new JTextField();
		用户名输入.setBounds(170, 85, 198, 29);
		getContentPane().add(用户名输入);
		用户名输入.setColumns(10);
		
		JLabel 密码 = new JLabel("\u5BC6\u7801");
		密码.setBounds(49, 141, 101, 29);
		密码.setHorizontalAlignment(SwingConstants.CENTER);
		密码.setFont(new Font("宋体", Font.PLAIN, 20));
		getContentPane().add(密码);
		
		密码输入 = new JTextField();
		密码输入.setBounds(170, 143, 198, 29);
		密码输入.setColumns(10);
		getContentPane().add(密码输入);
		
		JButton 确认 = new JButton("\u786E\u8BA4");
		确认.setBounds(59, 198, 136, 43);
		确认.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new AreaAdminlogin();
			}
		});
		确认.setFont(new Font("宋体", Font.PLAIN, 24));
		getContentPane().add(确认);
		
		JButton 取消 = new JButton("\u53D6\u6D88");
		取消.setBounds(264, 200, 136, 43);
		取消.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new login().setVisible(true);
			}
		});
		取消.setFont(new Font("宋体", Font.PLAIN, 24));
		getContentPane().add(取消);
	}

}
