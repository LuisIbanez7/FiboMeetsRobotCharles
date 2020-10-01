
import java.util.ArrayList;
import java.util.List;

import acm.program.*;

public class FibonacciSequence extends GraphicsProgram {
	public static final int MAX_TERM_VALUE = 10000;
	public void run() {
		fibNumber();
	}
	private void fibNumber() {
		int addedLastTwo = 0;
		List<Integer> fibList = new ArrayList<>();
		fibList.add(0);
		fibList.add(1);
		while(addedLastTwo <= MAX_TERM_VALUE) {
			fibList.add(getLastTwoAddition(fibList));
			addedLastTwo = getLastTwoAddition(fibList);
		}
		for (int num : fibList) {
			System.out.println(num);
		}
	}
	private int getLastTwoAddition(List<Integer> list) {
		int result = (list.get(list.size() - 1)) + list.get(list.size() - 2);
		return result;
	}
}
