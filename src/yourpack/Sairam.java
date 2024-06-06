package yourpack;
import mypack.*;

public class Sairam extends Sandeep
{
	int i = 90,j =40;
	
	public Sairam(int j, int i) {
		super();
		this.i = i;
		this.j = j;
		System.out.println("printing i,j"+i+" "+j);
	}
	
	public Sairam() {
		// TODO Auto-generated constructor stub
	 System.out.println("work1");
	}

	public static void main(String[] args) {
	Sairam obj = new Sairam();
	obj.display();
	Sairam obj1 = new Sairam(1, 3);
	obj1.display();
	
	
}

}
