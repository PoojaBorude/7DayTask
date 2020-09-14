package awtP;


import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class Query1 extends JFrame {
	static Query1 frame;
	public Query1() {
		//Code to view data in JTable
		List<T1> list=Dao.view();
		int size=list.size();
		
		String data[][]=new String[size][12];
		int row=0;
		for(T1 s:list){
		//data[row][0]=String.valueOf(s.getRollno());
			
			data[row][0]=String.valueOf(s.getno());
			data[row][1]=String.valueOf(s.getclinicid());
			data[row][2]=String.valueOf(s.getyear());
			data[row][3]=String.valueOf(s.getmonth());
			
			
			row++;
		}
		String columnNames[]={"No","Clinicid","Year","Month",};
		
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
					frame = new Query1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

