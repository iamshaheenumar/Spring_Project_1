package com.spring_1;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class registration_service extends db_connection {
	public int insertData(registration_bean reg){
		
		try{
			PreparedStatement pt= super.conn.prepareStatement("insert into tbl_reg(firstName,lastName,email,passd)values(?,?,?,?)");
			pt.setString(1,reg.getFirstName());
			pt.setString(2,reg.getLastName());
			pt.setString(3,reg.getEmail());
			pt.setString(4,reg.getPassword());
			boolean i=pt.execute();
			if(i==true){
				return 1;
			}
			else{
				return 0;
			}
		}catch(SQLException e){
			e.printStackTrace();
			return 0;
		}
	
	}
	

}
