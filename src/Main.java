public class Main {
    public static void main(String[] args) {

//		System.out.println("A");
//		int a = 1;
//		try {
//			int i = 5/0;
//			System.out.println("B");
//		}
////		catch(Exception e) {          // wrong
////			System.out.println("P");
////		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("D");
//		}
//		catch(ArithmeticException e) {
//			System.out.println("R");
//		}
//		catch(Exception e) {
//			System.out.println("P");
//		}
//		finally {
//			System.out.println("S");
//		}
//		System.out.println("C");

        // throw keyword
        System.out.println("A");
        try {
            fun(5);
        }
        catch(Exception e) {
            System.out.println("Your not eligible "+e);
        }
    }

//    public static int fun(int age) {
//        if(age < 18) {
//            throw new RuntimeException("Under age");
//        }
//        return 10;
//    }

    public static void fun(int age) throws ArithmeticException, ArrayIndexOutOfBoundsException{
        int i = 5/0;
    }
}

// Exception class is the parent so it should come after child class
// finally block will come with try catch and it should always come after try catch, and it definitely execute
