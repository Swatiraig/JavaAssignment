package MethodOverloading_Overriding;

public class MethodOverloading {

		public float add(int a, int b) {
			System.out.println(a + b);
			return a + b;

		}

		public float add(float a, float b, float c) {
			System.out.println(a + b + c);
			return a + b + c;
		}

		public float add(float a, float b) {
			System.out.println(a + b);
			return a + b;
		}

		public static void main(String[] args) {
			MethodOverloading mo = new MethodOverloading();
			System.out.println("addition of two float number is:");
			mo.add(4.5f, 5.4f);
			System.out.println("-----------------------------------");
			System.out.println("addition of integer no is:");
			mo.add(4, 5);
			System.out.println("------------------------------");
			System.out.println("addition of three float number is:");
			mo.add(3.4f, 5.4f, 7.8f);


	}

}
