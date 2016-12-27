import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.awt.event.ActionEvent;

public class Query1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Query1 frame = new Query1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Query1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 10, 398, 154);
		contentPane.add(textArea);
		
		JButton button = new JButton("查看");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File file = new File("word.txt"); // 创建文件对象
				try {
					// 创建FileReader对象
					FileReader in = new FileReader(file);
					char byt[] = new char[1024]; // 创建char型数组
					int len = in.read(byt); // 将字节读入数组
					// 设置文本域的显示信息
					textArea.setText(new String(byt, 0, len));
					in.close(); // 关闭流
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
				
		
		button.setBounds(41, 209, 93, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("返回");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Jfa j=new Jfa();
				j.setVisible(true);
				
			}
		});
		button_1.setBounds(249, 209, 93, 23);
		contentPane.add(button_1);
	}
}


