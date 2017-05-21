package frameWork;

public abstract class Things implements Cloneable{
	public Things(int x, int y, String image) {
		super();
		this.x = x;
		this.y = y;
		Image = image;
	}
	protected int x;
	protected int y;
    protected String Image;
	
}
