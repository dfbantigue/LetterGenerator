package oops;

public class X extends Letter {

	@Override
	public void printMe(int i, int num, int j, int k, StringBuffer strText) {
		// TODO Auto-generated method stub
		if (i == k || j == k)
			strText.append("*");
		else
			strText.append(" ");

	}
}
