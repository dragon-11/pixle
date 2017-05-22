package player;

import java.util.ArrayList;
import java.util.List;

import creatures.Creatures;
import frameWork.Factions;
import quests.Quest;

public class SinglePlayer extends Creatures{
	protected SinglePlayer(int x, int y, String image, int hp, int attack, Factions faction) {
		super(x, y, image, hp, attack, faction);
		
	}
	private List<Quest> quests = new ArrayList<>();
	private SinglePlayer singleplayer;
	private int level;

	public SinglePlayer getInstance(){
		if(singleplayer == null){
			singleplayer = new SinglePlayer(1,1,"...", 1, 1, Factions.FRENDLY);//i don't know Input 
		}
		
		return singleplayer;
	}

	
}
