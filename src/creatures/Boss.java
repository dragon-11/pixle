package creatures;

import frameWork.Factions;

abstract class Boss extends Creatures {

	protected Boss(int x, int y, String image, int hp, int attack, Factions faction) {
		super(x, y, image, hp, attack, faction);
		
	}


}
