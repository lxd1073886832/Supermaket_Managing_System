package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends JFrame {
	
	public login()
	{
		new JFrame();
		setSize(651, 435);
		setTitle("��¼");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel ������Ա = new JPanel();
		tabbedPane.addTab("\u7BA1\u7406\u4EBA\u5458", null, ������Ա, null);
		tabbedPane.setForegroundAt(0, Color.BLUE);
		������Ա.setLayout(null);
		
		JButton administrator = new JButton("\u7BA1\u7406\u5458\u767B\u5F55");
		administrator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Administratorlogin();
			}
		});
		administrator.setFont(new Font("����", Font.PLAIN, 26));
		administrator.setBounds(183, 131, 227, 79);
		������Ա.add(administrator);
		
		JButton AreaAdmin = new JButton("\u533A\u57DF\u7BA1\u7406\u8005\u767B\u5F55");
		AreaAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new AreaAdminlogin();
			}
		});
		AreaAdmin.setFont(new Font("����", Font.PLAIN, 26));
		AreaAdmin.setBounds(183, 236, 227, 79);
		������Ա.add(AreaAdmin);
		
		JLabel welcomeadmin = new JLabel("\u6B22\u8FCE\u6765\u5230\u7BA1\u7406\u767B\u5F55\u754C\u9762");
		welcomeadmin.setFont(new Font("����", Font.PLAIN, 30));
		welcomeadmin.setBounds(144, 10, 302, 43);
		������Ա.add(welcomeadmin);
		
		JLabel adminchooserole = new JLabel("\u8BF7\u9009\u62E9\u8EAB\u4EFD\u7C7B\u578B");
		adminchooserole.setFont(new Font("����", Font.PLAIN, 24));
		adminchooserole.setBounds(209, 63, 172, 43);
		������Ա.add(adminchooserole);
		
		JPanel ������Ա = new JPanel();
		������Ա.setLayout(null);
		tabbedPane.addTab("\u5DE5\u4F5C\u4EBA\u5458", null, ������Ա, null);
		tabbedPane.setForegroundAt(1, Color.BLUE);
		
		JButton transfer = new JButton("\u8D27\u8FD0\u5458\u767B\u5F55");
		transfer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		transfer.setFont(new Font("����", Font.PLAIN, 26));
		transfer.setBounds(183, 131, 227, 79);
		������Ա.add(transfer);
		
		JButton casher = new JButton("\u552E\u8D27\u5458\u767B\u5F55");
		casher.setFont(new Font("����", Font.PLAIN, 26));
		casher.setBounds(183, 236, 227, 79);
		������Ա.add(casher);
		
		JLabel welcomework = new JLabel("\u6B22\u8FCE\u6765\u5230\u5DE5\u4F5C\u767B\u5F55\u754C\u9762");
		welcomework.setFont(new Font("����", Font.PLAIN, 30));
		welcomework.setBounds(144, 10, 302, 43);
		������Ա.add(welcomework);
		
		JLabel workerchooserole = new JLabel("\u8BF7\u9009\u62E9\u8EAB\u4EFD\u7C7B\u578B");
		workerchooserole.setFont(new Font("����", Font.PLAIN, 24));
		workerchooserole.setBounds(209, 63, 172, 43);
		������Ա.add(workerchooserole);
		
		JPanel ������ = new JPanel();
		������.setLayout(null);
		tabbedPane.addTab("\u6D88\u8D39\u8005", null, ������, null);
		tabbedPane.setForegroundAt(2, Color.BLUE);
		
		JButton VIPlogin = new JButton("\u4F1A\u5458\u767B\u5F55");
		VIPlogin.setFont(new Font("����", Font.PLAIN, 26));
		VIPlogin.setBounds(183, 131, 227, 79);
		������.add(VIPlogin);
		
		JButton touristlogin = new JButton("\u6E38\u5BA2\u767B\u5F55");
		touristlogin.setFont(new Font("����", Font.PLAIN, 26));
		touristlogin.setBounds(183, 236, 227, 79);
		������.add(touristlogin);
		
		JLabel welcomeconsume = new JLabel("\u6B22\u8FCE\u6765\u5230\u6D88\u8D39\u767B\u5F55\u754C\u9762");
		welcomeconsume.setFont(new Font("����", Font.PLAIN, 30));
		welcomeconsume.setBounds(144, 10, 302, 43);
		������.add(welcomeconsume);
		
		JLabel consumechooserole = new JLabel("\u8BF7\u9009\u62E9\u8EAB\u4EFD\u7C7B\u578B");
		consumechooserole.setFont(new Font("����", Font.PLAIN, 24));
		consumechooserole.setBounds(209, 63, 172, 43);
		������.add(consumechooserole);;
		setVisible(true);
		setResizable(false);
		
	}
	public void uni(){
		dispose();
	}
	public static void main(String[] args){
		login asd =new login();
	}
}

