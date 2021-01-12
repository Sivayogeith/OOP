//Program
    //Class
        public class DupArr {

            // Main method
                public static void main(String[] args) {
                    int[] a = {0,11,22,33,44,55,66,77,88,99,111};
                    print(a);
                    int[] b = (int[])a.clone(); // Dup a in b  
                    print(b);
                    String[] c = {"AB", "CD", "EF"};
                    print(c);
                    String[] d = (String[])c.clone();// Dup c in d
                    print(d);
                    c[1] = "AB:BA"; // Change c but not d
                    print(c);
                    print(d);
                }


            // Printing method
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