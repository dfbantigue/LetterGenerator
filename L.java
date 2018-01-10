package oops;

public class L extends Letter {

	@Override
	public void printMe(int i, int num, int j, int k, StringBuffer strText) {
		// TODO Auto-generated method stub
		if (k == 0 || i == num - 1)
			strText.append("*");
		else
			strText.append(" ");

	}
}
