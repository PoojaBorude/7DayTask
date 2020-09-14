package awtP;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UI extends JFrame {
	static UI frame;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new UI();
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
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Query1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Query1.main(new String[]{});
				frame.disable();
			}
		});
		
		JLabel lblAccountantSection = new JLabel("UI Section");
		lblAccountantSection.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAccountantSection.setForeground(Color.DARK_GRAY);
		
		JButton btnViewStudent = new JButton("Query2");
		btnViewStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Query2.main(new String[]{});
			}
		});
		
		JButton btnEditStudent = new JButton("Query3");
		btnEditStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Query3.main(new String[]{});
				frame.dispose();
			}
		});
		
		JButton btnDueFee = new JButton("Query4");
		btnDueFee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Query4.main(new String[]{});
			}
		});
		
		JButton btnLogout = new JButton("Query5");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Dao.delete();
				//frame.dispose();
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(136)
							.addComponent(lblAccountantSection))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(52)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnEditStudent, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnDueFee, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
									.addGap(53)
									.addComponent(btnViewStudent, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(144)
							.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(53, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(7)
					.addComponent(lblAccountantSection)
					.addGap(25)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnViewStudent, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addGap(35)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnEditStudent, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnDueFee, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addGap(36)
					.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(138, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
