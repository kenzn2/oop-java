package songuyento;

public class Songuyento {
	private int a;

public Songuyento()
	{
		a=0;
	}
public Songuyento(int a) {
	this.a = a;
}

public boolean checksnt(int a) {
	boolean check = true;
	if(a<2) {check = false;}
	else {
		for(int i = 2; i <= Math.sqrt(a);i++) {
			if(a%i ==0) {check = false;break;}
		}
	}
	return check;
  }
public int nextSonguyento()
{
		int nextsnt;
		int i=0;
		while(true)
		{
			if(checksnt(a + ++i) == true)
			{
				return a +i;
			}
		}
}
}