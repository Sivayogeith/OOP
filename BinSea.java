//Program
    //Import
        import java.util.Arrays;
    //Class
    public class BinSea2 {
        //Main Method
            public static void main (String[] args){
                int[] a = {22, 22, 33, 44, 55, 66, 77, 77, 88};
                print(a);
                int n = 22;
                int y = 50 ;
                int h = 77 ;
                int t = 100 ;
                System.out.println("Search a of " + n +" : " + search(a, 22) +"/"+ a.length);

                System.out.println("Search a of " + y + ": " + search(a, 50) +"/"+ a.length);

                System.out.println("Search a of " + h + ": " + search(a, 77) +"/"+ a.length);
                
                System.out.println("Search a of " + t +": " + search(a, 100) +"/"+ a.length);
            }
        //Search method
            public static int search(int[] a , int x ){
                // POSTCONDITIONS: returns an integer i;
                // if i >= 0, then a[i] == x; otherwise x is not is not in a
                int lo = 0;
                int hel = a.length;
                while (lo < hel) {
                    // INVARIANT : if a[j]==x then lo <= j < hel
                    int i = (lo + hel)/2;
                    if (a[i] == x) {
                        return i;
                    } 
                    else if (a[i] < x) {
                        lo = i+1;
                    } 
                    else {
                        hel = i;                   
                    }
                }
                return -1;
            }
        // Print method
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
