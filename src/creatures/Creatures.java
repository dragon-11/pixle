package creatures;

import frameWork.Factions;
import frameWork.Things;

public abstract class Creatures extends Things{
	public Creatures(int x, int y, String image) {
		super(x, y, image);
		// TODO Auto-generated constructor stub
	}
	protected int hp;
	protected int attack;
	protected Factions faction;
}
