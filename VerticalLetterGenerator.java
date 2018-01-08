package oops;

public class VerticalLetterGenerator {

	public void printVertical(String arr[], int scale) throws Exception {
		if(scale<3||scale%2==0)
			throw new Exception("Input Value must be greater than or equal to 3, and must be odd numbers");
		
		StringBuffer strText = new StringBuffer();
		
		for (int k = 0; k < arr.length; k++) {
			for (int i = 0, j = scale - 1; i < scale; i++, j--) {
				
				try {
					printMe((Letter) Class.forName("oops." + arr[k]).newInstance(), i, scale, j,strText);
				} catch (InstantiationException e) {
					
				} catch (IllegalAccessException e) {
					
				} catch (ClassNotFoundException e) {
					throw new Exception("This Letter is not yet implemented");
				}
				
				strText.append("\n");
			}
			
		}
		
		System.out.println(strText.toString());

	}

	private static void printMe(Letter letter, int i, int scale, int j,StringBuffer strText) {
		letter.printMe(i, scale, j,strText);
	}
}
