package oops;

public class Y extends Letter {

	@Override
	public void printMe(int i, int num, int j,int k,StringBuffer strText) {
		// TODO Auto-generated method stub
		if ((i == k && i <= num / 2) || ( j == k && i <= num / 2))
				strText.append("*");
			else if (k == num / 2 && i > num / 2)
				strText.append("*");
			else
				strText.append(" ");
		
	}

}
