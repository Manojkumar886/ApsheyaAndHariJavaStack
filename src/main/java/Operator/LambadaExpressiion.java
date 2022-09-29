package Operator;

public class LambadaExpressiion {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int weight=10;
		
		Drawable d2=()->
		{
			System.out.println("Drawingg"+weight);
		};
		d2.draw();
	}

	
}


interface Drawable
{
	public void draw();
}