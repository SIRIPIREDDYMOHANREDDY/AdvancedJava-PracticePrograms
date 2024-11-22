package test_app2;

import java.util.Comparator;

public class SortedI implements Comparator<B>{
	@Override
	public int compare(B o1, B o2) {
		return o1.i - o2.i;
	}
}
