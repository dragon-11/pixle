package creatures;

import frameWork.Factions;
import frameWork.Things;

public abstract class Creatures extends Things{
	protected Creatures(int x, int y, String image, int hp, int attack, Factions faction) {
		super(x, y, image);
		this.hp = hp;
		this.attack = attack;
		this.faction = faction;
	}
	
	protected int hp;
	protected int attack;
	protected Factions faction;
}
