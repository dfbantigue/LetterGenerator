package oop;

import common.Constant;

public class HorizontalLetterGenerator {

	public void printHorizontal(String arr[], int scale) throws Exception {

		StringBuffer strText = new StringBuffer();

		if (scale < Constant.MININUM_ALLOWED_VALUES || scale % Constant.MOD == 0)
			throw new Exception(Constant.ALLOWED_VALUES_ERR_MSG);

		for (int i = 0, j = scale - 1; i < scale * arr.length; i++) {
			
			if (i != 0 && i % arr.length == 0) {
				strText.append(Constant.NEXTLINE);
				j--;
			}
			try {
				/* Calling the appropriate class based on array of String value */
				printIt((Letter) Class.forName("oop." + arr[i % arr.length].toUpperCase()).newInstance(),i / arr.length, scale, j, strText);
				strText.append(Constant.BLANK);
			} catch (ClassNotFoundException e) {
				throw new Exception(Constant.NOT_IMPLEMENT_LETTER_ERR_MSG);
			}

		}

		System.out.println(strText.toString());

	}

	private void printIt(Letter letter, int i, int scale, int j, StringBuffer strText) {
		for (int k = 0; k < scale; k++) {
			letter.printLetter(i, scale, j, k, strText);
		}
	}

}
