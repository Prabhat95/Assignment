
public class Main {
	
	public static void main(String[] args) {
       	Instrument ins[]= new Instrument[10];
		
	    for(int i = 0;i<3;i++)
	    	ins[i] = new Piano();
	    
	    for(int i = 3;i<6;i++)
	    	ins[i] = new Guitar();
	    
	    for(int i = 6;i<10;i++)
	    	ins[i] = new Flute();
	    
	    

         display(ins);
       	
     
		
       	
		
	}
	
	public static void display(Instrument ins[])
	{
		for(int i =0; i<10;i++)
		{
		   if(ins[i] instanceof Piano)
		   {
			   System.out.print("Piano played at Index : "+i+" ");
			   ins[i].play();
		   }
		   else if(ins[i] instanceof Guitar)
		   {
			   System.out.print("Guitar played at Index : "+i+" ");
			   ins[i].play();
		   }
		   else
		   {
			   System.out.print("Flute played at Index : "+i+" ");
			   ins[i].play();
		   }
		}
	}

}
