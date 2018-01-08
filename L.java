package oops;

public class L extends Letter{

	@Override
	public void printMe(int i, int num, int j,StringBuffer strText ) {
		// TODO Auto-generated method stub
		for (int k = 0; k < num; k++) {
			if (k==0 || i==num-1)
				strText.append("*");
			else
				strText.append(" ");
		}
	}	
}
