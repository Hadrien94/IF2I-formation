package com.formation.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.formation.entities.Activite;
import config.MySqlConnection;


public class ActiviteDao implements IActiviteDao {

	@Override
	public ArrayList<Activite> listeActivite(){

		ArrayList<Activite> activites = null;

		//algo
		
		Connection connection = MySqlConnection.getConnection();
		String sql = "SELECT * FROM Activite";
		try {
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(sql);
			activites = new ArrayList<>();
			while (result.next()) {
				activites.add(new Activite
						(result.getString("nomActivite"), 
								result.getString("lieuActivite"), 
								result.getString("lieuActivite")));
				
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return activites;

	}

    @Override
	public ArrayList<Activite> listeActiviteReserve(){

        ArrayList<Activite> activites = null;

		return activites;

	}

}
