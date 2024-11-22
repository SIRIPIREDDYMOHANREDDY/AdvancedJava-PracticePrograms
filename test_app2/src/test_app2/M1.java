package test_app2;

public class M1 {
	
	void test1() {
		// several statements
	}
	
	void test2() {
		// several statements
		return;
	}
	
//	void test3() {
//		// several statements
//		return 10;
//	}
	
//	int test4() {
//		// several statements
//	}
	
//	int test5() {
//		// several statements
//		return;
//	}
	
	int test6() {
		// several statements
		return 10;
	}
	
//	int test7(boolean b1) {
//		// several statements
//		if(b1) {
//			return 10;
//		}
//	}
	
	int test8(boolean b1) {
		// several statements
		if(b1) {
			return 10;
		}
		return 5;
	}
	
//	int test9(boolean b1) {
//		// several statements
//		if(b1) {
//			return 10;
//		}
//		else {
//			return 45;
//		}
//		//return 5;
//	}
	
	int test10(boolean b1) {
		// several statements
		if(b1) {
			return 10;
		}
		else {
			return 45;
		}
	}
	
//	int test11(boolean b1) {
//		// several statements
//		if(b1) {
//			return 10;
//		}
//		else {
//			
//		}
//	}
	
//	int test12(boolean b1) {
//		// several statements
//		if(b1) {
//			
//		}
//		else {
//			return 10;
//		}
//	}
	
	int test13(boolean b1) {
		// several statements
		if(b1) {
			
		}
		else {
			return 20;
		}
		return 100;
	}
	
	int test14(boolean b1) {
		// several statements
		if(b1) {
			return 20;
		}
		else {
			
		}
		return 100;
	}
	
	int test15(boolean b1) {
		// several statements
		try {
			// several statements
		}
		catch(NullPointerException ex) {
			// several statements
		}
		return 100;
	}
	
	int test16(boolean b1) {
		// portion 1
		try {
			// portion 2
		}
		catch(NullPointerException ex) {
			// portion 3
		}
		return 100;
	}
	
//	int test17(boolean b1) {
//		// several statements
//		try {
//			// several statements
//			return 100;
//		}
//		catch(NullPointerException ex) {
//			// several statements
//		}
//	}
	
	int test18(boolean b1) {
		// several statements
		try {
			// several statements
			return 100;
		}
		catch(NullPointerException ex) {
			// several statements
			return 100;
		}
	}
	
//	int test19(boolean b1) {
//		// several statements
//		try {
//			// several statements
//		}
//		catch(NullPointerException ex) {
//			// several statements
//			return 100;
//		}
//	}
	
//	int test20(boolean b1) {
//		// several statements
//		try {
//			// several statements
//			return 100;
//		}
//		catch(NullPointerException ex) {
//			// several statements
//			return 000;
//		}
//		return 50;
//	}
	
	int test21(boolean b1) {
		// several statements
		try {
			// several statements
			return 100;
		}
		catch(NullPointerException ex) {
			// several statements
			return 2000;
		}
		catch(ArithmeticException ex) {
			// several statements
		}
		return 50;
	}
	
//	int test22(boolean b1) {
//		// several statements
//		try {
//			// several statements
//			return 100;
//		}
//		catch(NullPointerException ex) {
//			// several statements
//			return 2000;
//		}
//		catch(ArithmeticException ex) {
//			// several statements
//			return 3000;
//		}
//		return 50;
//	}
	
	int test23(boolean b1) {
		// several statements
		try {
			// several statements
		}
		catch(NullPointerException ex) {
			// several statements
			return 2000;
		}
		catch(ArithmeticException ex) {
			// several statements
			return 3000;
		}
		return 50;
	}
	
	int test24(boolean b1) {
		// several statements
		try {
			// several statements
		}
		catch(NullPointerException ex) {
			// several statements
			return 2000;
		}
		catch(ArithmeticException ex) {
			// several statements
		}
		return 50;
	}
	
//	int test25(boolean b1) {
//		// several statements
//		try {
//			// several statements
//		}
//		catch(NullPointerException ex) {
//			// several statements
//			return 2000;
//		}
//		catch(ArithmeticException ex) {
//			// several statements
//		}
//		finally {
//			// several statements
//			return 2000;
//		}
//		return 50;
//	}
	
	int test26(boolean b1) {
		// several statements
		try {
			// several statements
		}
		catch(NullPointerException ex) {
			// several statements
			return 2000;
		}
		catch(ArithmeticException ex) {
			// several statements
		}
		finally {
			// several statements
			return 2000;
		}
	}
	
	int test27(boolean b1) {
		// several statements
		try {
			// several statements
			return 5;
		}
		catch(NullPointerException ex) {
			// several statements
			return 10;
		}
		finally {
			// several statements
			return 100;
		}
	}
}
