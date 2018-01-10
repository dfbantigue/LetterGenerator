package oops;

public class HorizontalLetterGenerator {

	public void printHorizontal(String arr[], int scale) throws Exception {

		StringBuffer strText = new StringBuffer();

		if (scale < 3 || scale % 2 == 0)
			throw new Exception("Input Value must be greater than or equal to 3, and must be odd numbers");

		for (int i = 0, j = scale - 1; i < scale; i++, j--) {
			for (int k = 0; k < arr.length; k++) {
				try {
					printMe((Letter) Class.forName("oops." + arr[k]).newInstance(), i, scale, j,strText);
					strText.append("  ");
				} catch (InstantiationException e) {

				} catch (IllegalAccessException e) {

				} catch (ClassNotFoundException e) {
					throw new Exception("This Letter is not yet implemented");
				}

			}
			strText.append("\n");
		}
		
		System.out.println(strText.toString());

	}

	private void printMe(Letter letter, int i, int scale, int j, StringBuffer strText) {
		for (int k = 0; k < scale; k++) {
			letter.printMe(i, scale, j, k, strText);
		}
	}

}
