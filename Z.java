package oops;

public class Z extends Letter {

	@Override
	public void printMe(int i, int num, int j,StringBuffer strText) {
		// TODO Auto-generated method stub
		for (int k = 0; k < num; k++) {
			if (i == 0 || i == num - 1 ||(j == k))
				strText.append("*");
			else
				strText.append(" ");
		}
	}

}
