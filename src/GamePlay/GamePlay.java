package GamePlay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import Players.players;

public class GamePlay {
	private static List<players>allCards;
	private static List<players>userCards;
	private players[] computerPlayer;
	int number;

	public GamePlay(List<players>allplayers,List<players>user) {
		allCards = allplayers;
		userCards = user;
		 computerPlayer = new players[5];
	}
	
	
	public void playGame() {
		 Collections.shuffle(allCards);
		 for ( int i =0; i< 5; i++) {
			 computerPlayer[i]= allCards.get(i);}
		 
		 }
		 
	
	public void showPlayers() { 
		 
		 players[] player1 = new players[userCards.size()];
		 for (int i=0;i < userCards.size();i++) {
		 	player1[i] = userCards.get(i);
		 }

		 for (players player : player1) {
		 	System.out.println(player.getname() + " " + player.getOffense()+" "+ player.getDefense()+" "+ player.getRebounding()+" "+player.getPlaymaking()+" ");
		 }
	}
		
	public int getStat(players player, String stat) {
		
		String choice = stat;
		switch (choice) {
		case "Offense":
				number = player.getOffense();
				break;
		case "Defense":
				number = player.getDefense();
				break;
		case "Playmaking":
				number = player.getPlaymaking();
				break;
		case "Rebounding":
				number = player.getRebounding();
				break;
		}
		return number;
	}
	 public players findPlayer(String name) {
	        for (players player : userCards) {
	            if (player.getname().equalsIgnoreCase(name)) {
	                return player;
	            }
	        }
			return null;
	 }
	 public players[] getComputerPlayer() {
	        return computerPlayer;
	    }
	}
