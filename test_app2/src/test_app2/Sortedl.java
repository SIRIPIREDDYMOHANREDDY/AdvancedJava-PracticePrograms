package test_app2;

import java.util.Comparator;

public class Sortedl implements Comparator<B>{
	@Override
	public int compare(B o1, B o2) {
		return o1.l - o2.l;
	}
}
