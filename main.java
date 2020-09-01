package circleprogram;

public class main {

	public static void main(String[] args) {
		circle one = new circle(); //Constructor 1 
		circle two = new circle(10, "green"); //Constructor 2
		

		System.out.println(two.getRadius());
		System.out.println(two.getColor());

	}

}
