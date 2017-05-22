package npc;

import java.util.ArrayList;
import java.util.List;

import creatures.Creatures;
import frameWork.Factions;
import quests.Quest;


public abstract class NPC extends Creatures{
	private List<Quest> list =  new ArrayList<>();
	protected NPC(int x, int y, String image, int hp, int attack, Factions faction) {
		super(x, y, image, hp, attack, faction);
		
	}

	

}
