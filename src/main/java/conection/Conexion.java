package conection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Conexion 
{
	private static Conexion conexion = null;
	private Connection con = null;
	private Statement st;

	private Conexion() {
		
		try {
			
			String url = "jdbc:postgresql://localhost:5432/sgaa";
			String user = "postgres";
			String password = "postgres";
			
			con = DriverManager.getConnection(url, user, password);

			System.out.println("Conexión Realizada");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static Conexion getInstance() {
		if (conexion == null) {
			conexion = new Conexion();
		}
		return conexion;
	}
	
	public ResultSet getQuery(String query) {
		ResultSet rs = null;
		try {
			st = con.createStatement();
			rs = st.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	public boolean executeQuery(String query) {
		boolean ex = false;
		
		try {
			System.out.println(query);
			st = con.createStatement();
			
			ex = st.execute(query);
			ex = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ex;
	}
}
