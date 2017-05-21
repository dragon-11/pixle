package blocks;

import java.util.Random;

import frameWork.Things;

public abstract class Block extends Things{
	public Block(int x, int y, String image, int durabillty) {
		super(x, y, image);
		this.durabillty = durabillty;
	}
    protected static Random rd = new Random();
	protected int durabillty;
}
