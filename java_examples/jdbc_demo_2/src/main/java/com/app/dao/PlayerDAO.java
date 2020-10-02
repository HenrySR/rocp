package com.app.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.app.model.Player;
import com.app.dbutil.MySqlConnection;

public interface PlayerDAO {

	
	public int createPlayer(Player player);
		
	public List<Player> getAllPlayers();
	
	public int updatePlayer(int id,String city);
	
	public void deletePlayer(int id);
}
