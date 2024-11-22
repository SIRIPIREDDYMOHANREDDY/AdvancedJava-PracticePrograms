package mamoryManagement;

public class Test {
	public static void main(String[] args) {
		// new Test().add(1);
		int size = 10;
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			int[] arr = new int[size];
			size *= 2;
			System.out.println(size);

		}
		// 1342177280
		// 1342177280
		// -1610612736
		// 41943040
		// -Xmx500m -heap memory

	}

	public void add(int i) {
		System.out.println(i);
		i++;
		if (i < 1000)
			add(i);
	}
//19902
//19348
//-Xss2m - stackmemory
}
