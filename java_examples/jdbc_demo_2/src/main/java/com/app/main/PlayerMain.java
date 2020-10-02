package com.app.main;

import com.app.dao.PlayerDAO;
import com.app.model.Player;

import com.app.dao.impl.PlayerDAOImpl;
import java.util.List;

public class PlayerMain {

	public static void main(String[] args) {
		PlayerDAO dao=new PlayerDAOImpl();
//		Player player=new Player(111, "Shivani", 23, "Rockers", "f", "Delhi");
//		int c= dao.createPlayer(player);
//		if(c==1) {
//			System.out.println("Player registerd with below details");
//			System.out.println(player);
//		}else {
//			System.out.println("Failed registration");
//		}
		int c = dao.updatePlayer(100, "New York");
		System.out.println(c);
		List<Player> playersList=dao.getAllPlayers();
		System.out.println("\n\nThere are "+playersList.size()+" no of players registered with us.. Below are the details");
		for(Player p:playersList) {
			System.out.println(p);
		}
	}

}
