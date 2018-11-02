package q2;

import java.util.Random;

public class TestCompartment {

	public static void main(String[] args) {
		Compartment c[] = new Compartment[10];
				
				int Min=0;
				int Max=3;
				
				int x;

				
				for(int i = 0; i<10; i++)
				{
					x= (int)(Math.random() * ((Max - Min) + 1));

					
					if(x==0)
					{
						c[i] = new FirstClass();
					}
					
					if(x==1)
					{

						c[i] = new Luggage();
					}
					
					if(x==2) {

						c[i] = new Ladies();
					}
					
					if(x==3)
					{						

						c[i] = new General();
					}
				}
				
				
				
				for(Compartment x1 : c)
				{
					x1.notice();
				}

	}

}
