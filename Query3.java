package awtP;


import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class Query3 extends JFrame {
	static Query3 frame;
	public Query3() {
		//Code to view data in JTable
		List<T2> list=Dao.view3();
		int size=list.size();
		
		String data[][]=new String[size][12];
		int row=0;
		for(T2 s:list){
		//data[row][0]=String.valueOf(s.getRollno());
			data[row][0]=String.valueOf(s.getid());
			data[row][1]=String.valueOf(s.getpracticeid());
			data[row][2]=s.getlastname();
			data[row][3]=s.getfirstname();
			data[row][4]=s.getgender();
			data[row][5]=s.getbirthdate();
			data[row][6]=String.valueOf(s.getage());
			data[row][7]=s.getpatientage();
			
			row++;
		}
		String columnNames[]={"patid","practiceid","lastname","firstname","gender","birthdate","age","patientage"};
		
		JTable jt=new JTable(data,columnNames);
		JScrollPane sp=new JScrollPane(jt);
		add(sp);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 400);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Query3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
