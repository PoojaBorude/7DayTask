package awtP;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class Query4 extends JFrame {
	static Query4 frame;
	public Query4() {
		//Code to view data in JTable
		List<T4> list=Dao.view4();
		int size=list.size();
		
		String data[][]=new String[size][12];
		int row=0;
		for(T4 s:list){
			
			data[row][0]=String.valueOf(s.getno());
			data[row][1]=s.getproctype();
			data[row][2]=String.valueOf(s.getyear());
			data[row][3]=String.valueOf(s.getmonth());
//			
			row++;
		}
		String columnNames[]={"No","Proceduretype","Month","year"};
		
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
					frame = new Query4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

