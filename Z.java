package oops;

public class Z extends Letter {

	@Override
	public void printMe(int i, int num, int j, int k, StringBuffer strText) {
		// TODO Auto-generated method stub
		if (i == 0 || i == num - 1 || (j == k))
			strText.append("*");
		else
			strText.append(" ");

	}

}
