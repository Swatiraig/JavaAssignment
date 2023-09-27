package Try_Catch;

public class MultipleCatch {

		public static void main(String[] args) {
			try {
				int a[] = new int[5];
				// a[5]=30/5; // task 2 is completed
				// a[3]=30/3; // this code always be excuted finally block execute
				a[5] = 30 / 0; // task 1 is completed
				a[3] = 30 / 3;
				System.out.println("try block is executed");
			} catch (ArithmeticException e) {
				System.out.println("task 1 is completed");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("task 2 is completed");
			} catch (Exception e) {
				System.out.println("common task is completed");
			} finally {
				System.out.println("this code always be excuted");
			}
			System.out.println("rest of the code");

		}

	

		

	}


