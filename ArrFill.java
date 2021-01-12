//Program
    //Import
      import java.util.Arrays;
    //Class
      public class ArrFill {
        //Main method
            public static void main(String[] args){
                System.out.println("Comic of the day: Type the Code Away");
                System.out.println("Read it in ArrFill.java Young Programers!");
                System.out.println("Young Programers : Ok, lets run ArrFill to read the Comic");

                System.out.println("Comic: ");
                int[] x = {10,20,30,40,50,00,70};
                System.out.print("Computer prints: ");print(x);
                System.out.println("Yogi: Hey,that 0 have to be 60");
                System.out.println("Computer: Ok, Changing Now....");
                Arrays.fill(x,5,6,60);
                print(x);
                System.out.println("Yogi: Now it is good.");
                System.out.println("Moral of the story is: ");
                System.out.println("Use Arrays.fill() to change a part in a Array Object");

            }
        //Print method
            public static void print(int[] a) {
                System.out.printf("{%d", a[0]);
                    for (int i = 1; i < a.length; i++) {
                        System.out.printf(", %d", a[i]);
                    }
                    System.out.println("}");
                }

                public static void print(Object[] a) {
                    System.out.printf("{%s", a[0]);
                    for (int i = 1; i < a.length; i++) {
                        System.out.printf(", %s", a[i]);
                    }
                    System.out.println("}");
                }
            }