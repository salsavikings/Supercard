package Players;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

import GamePlay.GamePlay;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean Ended = true;
		Scanner scnr = new Scanner(System.in);
		List<players>allplayers = new ArrayList<>();
		
		allplayers.add(new Anthony_Edwards());
		allplayers.add(new Donovan_Mitchell());
		allplayers.add(new Jaden_McDaniels());
		allplayers.add(new Karl_Anthony_Towns());
		allplayers.add(new MikalBridges());
		allplayers.add(new Mike_Conley());
		allplayers.add(new NazReid());
		allplayers.add(new NeemtasQueta());
		allplayers.add(new Rudy_Gobert());
		allplayers.add(new Russell_Westbrook());
		
		
		List<players>bronze = new ArrayList<>();
		List<players>silver = new ArrayList<>();
		List<players>gold = new ArrayList<>();
		
		
		for (int i = 0 ; i<allplayers.size(); i++) {
			players currentplayer = allplayers.get(i);
			String type = currentplayer.getType();
			if (type.equals("Bronze")) {
				bronze.add(currentplayer);
			}
			else if ( type.equals("Silver")) {
				silver.add(currentplayer);
			}
			else if (type.equals("Gold")) {
				gold.add(currentplayer);
			}
			
		}
		List<players>User = new ArrayList<>();
		User.add(new Anthony_Edwards());
		User.add(new Jaden_McDaniels());
		User.add(new Karl_Anthony_Towns());
		User.add(new Mike_Conley());
		User.add(new Rudy_Gobert());
	
		GamePlay game = new GamePlay(allplayers, User);
	while (Ended) {
		
		System.out.println("Choose one: [P]lay, [S]how, [Q]uit");
		String choice = scnr.nextLine().toUpperCase();
		
		try {
			switch(choice) {
			case "P":
				int HomeScore= 0;
				int AwayScore = 0;
				int playCounter = 0;
				while(playCounter < 4) {
			game.playGame();
				Random random = new Random();
		        String[] stats = {"Offense", "Defense", "Rebounding", "Playmaking"};
		        String stat1 = stats[random.nextInt(stats.length)];
		        String stat2 = stats[random.nextInt(stats.length)];
		        System.out.println(stat1 + " " + stat2);
		        System.out.println("Choose your Player");
			players player = game.findPlayer(scnr.nextLine());
			players complayer = game.getComputerPlayer()[playCounter];
				if (player !=null) {
					System.out.println("You chose " + player.getname()+ " "+ game.getStat(player, stat1)+ " " + game.getStat(player, stat2));
					System.out.println("Your opponent chose " + complayer.getname()+ " "+ game.getStat(complayer, stat1)+ " " + game.getStat(complayer, stat2));
					int Uscore = game.getStat(player, stat1)+ game.getStat(player, stat2);
					int ComScore = game.getStat(complayer, stat1)+ game.getStat(complayer, stat2);
					
					if (Uscore > ComScore ) {
						HomeScore += 30;
						AwayScore += 25;	
					}
					else if(Uscore == ComScore) {
						HomeScore += 27;
						AwayScore += 27;
					}
					else  {
							HomeScore += 25;
							AwayScore += 30;
					}
					
					System.out.println(HomeScore + " - " + AwayScore);
					
					playCounter++;}
				}
				if (HomeScore > AwayScore) {
					System.out.println("You Win");
					Random rand = new Random();
					players newplayer = allplayers.get(rand.nextInt(allplayers.size()));
					User.add(newplayer);
					System.out.println("You Got " + newplayer.getname());
				}
				else {
					System.out.println("You Lose");
				}
			break;
			case "S":
			game.showPlayers();
			break;
			
			case "Q":
				 Ended = false;
				 break;
				 
				
			 }
	}
	 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	 scnr.close();
	}
}
