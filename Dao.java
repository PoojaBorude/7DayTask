package awtP;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
public class Dao {

	
	public static void delete(){
		int status=0;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123");
			
			
					
					Statement stmt=con.createStatement();
					String sql;
					sql="delete from appointmentinfo where amount<50";
					PreparedStatement pt=con.prepareStatement(sql);
					//ResultSet rs=stmt.executeQuery(sql);
					int row=pt.executeUpdate();
					
						//System.out.println("Record deleted"+row);
					if(row>1)
					{
						
						JOptionPane.showMessageDialog(UI.frame, "Record deleted");
					}
					else
					{
						//System.out.println("hiiii");
						JOptionPane.showMessageDialog(UI.frame, "Record not found");
					}
						
				
					con.close();
				}catch(Exception e1)
				{
					System.out.println(e1);
				}
		
	}
	public static List<T1> view(){
		List<T1> list=new ArrayList<T1>();
		try{
			//Connection con=Dao.getCon();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123");
			PreparedStatement ps=con.prepareStatement("select count(*) No,clinicid,extract(year from apptdate) year,extract(month from apptdate) Month from appointmentinfo group by extract(month from apptdate),extract(year from apptdate),clinicid");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				T1 s=new T1();
				
				s.setno(rs.getInt("No"));
				s.setclinicid(rs.getInt("clinicid"));
				s.setyear(rs.getInt("year"));
				s.setmonth(rs.getInt("month"));
				list.add(s);
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
	}
	
	public static List<T2> view3(){
		List<T2> list=new ArrayList<T2>();
	
		try{
			//Connection con=Dao.getCon();
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123");
			PreparedStatement ps=con.prepareStatement("select patid,practiceid,lastname,firstname,gender,birthdate,age,patientage from patientinfo");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				T2 s=new T2();
				s.setid(rs.getInt("patid"));
				s.setpracticeid(rs.getInt("practiceid"));
				s.setlastname(rs.getString("lastname"));
				s.setfirstname(rs.getString("firstname"));
				s.setgender(rs.getString("gender"));
				s.setbirthdate(rs.getString("birthdate"));
				s.setage(rs.getInt("age"));
				s.setpatientage(rs.getString("patientage"));
				list.add(s);
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
	}
	public static List<T4> view4(){
		List<T4> list=new ArrayList<T4>();
		try{
			//Connection con=Dao.getCon();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123");
			PreparedStatement ps=con.prepareStatement("select count(*) No,proctype,extract(month from proceduredate) Month,extract(year from proceduredate) year from transactioninfo group by proctype,extract(month from proceduredate),extract(year from proceduredate)");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				T4 s=new T4();
				
				s.setno(rs.getInt("No"));
				s.setproctype(rs.getString("proctype"));
				s.setyear(rs.getInt("year"));
				s.setmonth(rs.getInt("month"));
				list.add(s);
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
		
		}
	public static List<T2> due(){
		List<T2> list=new ArrayList<T2>();
	
		try{
			//Connection con=Dao.getCon();
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123");
			PreparedStatement ps=con.prepareStatement("select patid,practiceid,lastname,firstname,gender,birthdate,age,patientage from patientinfo where patid in(select patid from appointmentinfo where apptdate<(select to_char(sysdate,'dd-mon-yy') from dual))");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				T2 s=new T2();
				s.setid(rs.getInt("patid"));
				s.setpracticeid(rs.getInt("practiceid"));
				s.setlastname(rs.getString("lastname"));
				s.setfirstname(rs.getString("firstname"));
				s.setgender(rs.getString("gender"));
				s.setbirthdate(rs.getString("birthdate"));
				s.setage(rs.getInt("age"));
				s.setpatientage(rs.getString("patientage"));
				list.add(s);
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
	}
	

}
	