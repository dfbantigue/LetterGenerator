package oop;

import common.Constant;

public class VerticalLetterGenerator {
	public void printVertical(String arr[], int scale) throws Exception {
		if (scale < Constant.MININUM_ALLOWED_VALUES || scale % Constant.MOD == 0)
			throw new Exception(Constant.ALLOWED_VALUES_ERR_MSG);

		StringBuffer strText = new StringBuffer();

		for (int i = 0, k = 0, j = scale - 1; i < scale * arr.length; i++, j--) {

			if (i != 0 && i % scale == 0) {
				j = scale - 1;
				k++;
			}

			try {
				/* Calling the appropriate class based on array of String value */
				printIt((Letter) Class.forName("oop." + arr[k].toUpperCase()).newInstance(), i % scale, scale, j,strText);
			} catch (ClassNotFoundException e) {
				throw new Exception(Constant.NOT_IMPLEMENT_LETTER_ERR_MSG);
			}
			strText.append(Constant.NEXTLINE);
		}

		System.out.println(strText.toString());

	}

	private void printIt(Letter letter, int i, int scale, int j, StringBuffer strText) {
		for (int k = 0; k < scale; k++) {
			letter.printLetter(i, scale, j, k, strText);
		}
	}
}

