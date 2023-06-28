package database;

import java.sql.*;
import java.util.Scanner;

public class DatabaseConnectionDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatabaseConnection connect1 = new DatabaseConnection("cse110first","root", "");
		
		Connection connection = connect1.getConnection();
		Statement statement = null;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Sex");
		String sex = input.next();
		
		try {
			statement = connection.createStatement();
			//String sql = "INSERT INTO STUDENT VALUES ('2020-2-60-170', 'Most Mahbuba Yasmin', 'F', 'Dhaka', '106.5')";
			//System.out.println("Successfully Insert");
			//statement.executeUpdate(sql);
			//String sql = "UPDATE STUDENT SET address = 'Noakhali' WHERE id = '2020-3-60-087'";
			//System.out.println("Successfully Updated");
			String sql = "SELECT * FROM STUDENT WHERE sex = '"+ sex +" ' ";
			ResultSet rs = statement.executeQuery(sql);
			//statement.executeLargeUpdate(sql);
			
			while(rs.next()) {
				System.out.println(rs.getString("id") + " " + rs.getString("name") + " " + rs.getString("sex") +
									" " + rs.getString("address") + " " + rs.getString("totalCreditComplete"));
				
			}
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
