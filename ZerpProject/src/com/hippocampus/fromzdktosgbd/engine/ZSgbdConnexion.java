package com.hippocampus.fromzdktosgbd.engine;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hippocampus.statics.Statics;
import com.hippocampus.zdk.ZComponent;
import com.hippocampus.zdk.ZExceptions;
import com.hippocampus.zformcomponent.ZFormComponent;
import com.hippocampus.zformcomponent.ZText;
import com.mysql.jdbc.PreparedStatement;

public class ZSgbdConnexion {

	private static ZSgbdConnexion sgbdConnexion = new ZSgbdConnexion();
	private String driver = "com.mysql.jdbc.Driver";
	private String db = "jdbc:mysql://localhost:3306/zproject";
	private String root = "root";
	private String pwd = "";

	private ZSgbdConnexion() {
	}

	public static ZSgbdConnexion getInstance() {
		return sgbdConnexion;
	}

	// ZText text = new ZText(_name, _value, _placeHolder, _size,
	// formVisibility, treeVisibility);

	public void insertZTextSchema(ZText zText) {
		try {
			String reqString = "";
			Class.forName(driver);
			java.sql.Connection con = DriverManager
					.getConnection(db, root, pwd);
			// /INSERT INTO `zproject`.`simple_component`
			// (`id_simple_component`,
			// `simpl_comp_name`, `simpl_comp_value`, `simpl_comp_placeholder`,
			// `simpl_comp_size`, `simpl_comp_formvisibility`,
			// `simpl_comp_treevisibility`, `simpl_comp_type`,
			// `simpl_comp_status`)
			// VALUES (NULL, '5', '5', '5', '5', '5', '5', '5', '5');
			if (zText != null) {// that is a simple table simple component
				int tree = 0;
				if (zText.isTreeVisibility()) {
					tree = 1;
				}
				int form = 0;
				if (zText.isFormVisibility()) {
					form = 1;
				}
				int status = 0;
				if (zText.get_status()) {
					status = 1;
				}
				System.out.println("Inserting Ztext Component to db :\n "
						+ zText.get_name());
				reqString = "INSERT INTO `simple_component` (`id_simple_component`, `simpl_comp_name`, `simpl_comp_value`, `simpl_comp_placeholder`, `simpl_comp_size`, `simpl_comp_formvisibility`, `simpl_comp_treevisibility`, `simpl_comp_type`, `simpl_comp_status`) VALUES "
						+ "																			(NULL, '"
						+ zText.get_name()
						+ "', '"
						+ zText.get_value()
						+ "', '"
						+ zText.get_placeHolder()
						+ "', '"
						+ zText.get_size()
						+ "', '"
						+ form
						+ "', '"
						+ tree
						+ "', '"
						+ Statics.Ztext + "', '" + status + "');  ";
			}
			java.sql.PreparedStatement statement = con
					.prepareStatement(reqString);
			statement.executeUpdate();
			statement.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ZFormComponent getZcomponent(int id) {
		ZFormComponent component=null;
		try {
			Class.forName(driver);
			java.sql.Connection con = DriverManager
					.getConnection(db, root, pwd);
			PreparedStatement statement = (PreparedStatement) con
					.prepareStatement("select * from simple_component where id_simple_component='"
							+ id + "' ");
			ResultSet rs = statement.executeQuery();
	
			
			String simpl_comp_name = "";
			String simpl_comp_value = "";
			String	simpl_comp_placeholder = "";
			int	simpl_comp_size = 0;
			int	simpl_comp_formvisibility =0;
			int	simpl_comp_treevisibility = 0;
			String simpl_comp_type = "";
			int	simpl_comp_status = 0;
			
			// (`id_simple_component`,
					// `simpl_comp_name`, `simpl_comp_value`, `simpl_comp_placeholder`,
					// `simpl_comp_size`, `simpl_comp_formvisibility`,
					// `simpl_comp_treevisibility`, `simpl_comp_type`,
					// `simpl_comp_status`)
			
			while (rs.next()){
				simpl_comp_name = rs.getString("simpl_comp_name");
				simpl_comp_value = rs.getString("simpl_comp_value");
				simpl_comp_placeholder = rs.getString("simpl_comp_placeholder");
				simpl_comp_size = rs.getInt("simpl_comp_size");
				simpl_comp_formvisibility =rs.getInt("simpl_comp_formvisibility");
				simpl_comp_treevisibility = rs.getInt("simpl_comp_treevisibility");
				simpl_comp_type = rs.getString("simpl_comp_type");
				simpl_comp_status =  rs.getInt("simpl_comp_status");
			}
			if (simpl_comp_type.equalsIgnoreCase(Statics.Ztext)){// test type of component and return it
				boolean tree=false;
				if(simpl_comp_treevisibility==1){
					tree=true;
				}
				boolean form=false;
				if(simpl_comp_formvisibility==1){
					form=true;
				}
				component = new ZText(simpl_comp_name, simpl_comp_value, simpl_comp_placeholder, simpl_comp_size, form	, tree);
			}
		
			//System.out.println("simpl_comp_type" + simpl_comp_type);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

		return component;
	}

}
