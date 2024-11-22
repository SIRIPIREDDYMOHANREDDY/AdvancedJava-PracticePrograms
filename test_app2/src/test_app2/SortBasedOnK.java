package test_app2;

import java.util.Comparator;

public class SortBasedOnK implements Comparator<A>{
	@Override
	public int compare(A o1, A o2) {
		return o1.k - o2.k;
	}
}
