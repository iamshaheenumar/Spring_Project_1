package com.spring_1;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class registration_service extends db_connection {
	public boolean insertData(registration_bean reg){
		
		try{
			PreparedStatement pt= super.conn.prepareStatement("insert into tbl_reg(firstName,lastName,email,passd,file)values(?,?,?,?,?)");
			pt.setString(1,reg.getFirstName());
			pt.setString(2,reg.getLastName());
			pt.setString(3,reg.getEmail());
			pt.setString(4,reg.getPassword());
			pt.setString(5, reg.getFileName());
			boolean i=pt.execute();
			System.out.println(i);
			return true;
		}catch(SQLException e){
			e.printStackTrace();
			return false;
		}
	
	}
	

}
