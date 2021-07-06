public class LoopIntro {

    
    public static void main(String[] args) {

        int n = 10;
        int[] num = { 23, 45, 65, 78, 89 };

        // use loop to print each number in a new line.

        for (int i = 2; i < num.length; i++) {
            // System.out.println(num[i]);
        }

        // print the in reverse order.
        for (int i = num.length - 1; i >= 0; i--) {
            // System.out.println(num[i]);
        }

        // return true if number 6 is at the first or last position ,
        // otherwis return false.

        System.out.println("====First last 6 ======");

        System.out.println(firstLast6(new int[] { 6, 7, 8, 9 }));
        System.out.println(firstLast6(new int[] { 6, 7, 8, 6 }));
        System.out.println(firstLast6(new int []{9,7,8,3}));

        System.out.println("====Same First  ======");
        System.out.println(sameFirstLast(new int[] { 6, 7, 8, 6 }));
        System.out.println(sameFirstLast(new int[] { 2, 7, 8, 6 }));
        System.out.println(sameFirstLast(new int[] { 2, 7, 8, 2 }));

        System.out.println("====Sum ======");
        System.out.println(sum3(new int[] { 2, 7, 8, 2 }));

        System.out.println("====Count Even ======");
        System.out.println(countEven(new int[] { 2, 1, 2, 3 }));

        System.out.println("====Either 24 ======");
        System.out.println(either24(new int[] { 1, 2, 2 }));
        System.out.println(either24(new int[] { 4,4,1 }));
        System.out.println(either24(new int[] { 4,4,1,2,2 }));
        System.out.println(either24(new int[] { 1, 2, 3, 2, 2, }));
        
        System.out.println("====MOD 3 ======");
        System.out.println(modThree(new int[] { 2, 1, 3, 5 }));
        System.out.println(modThree(new int[] { 2,1,2,5 }));








    }
    


    public static boolean firstLast6(int[] arr) {

        // for (int j : arr) {
        //     if (arr[0] == 6 || arr[arr.length - 1] == 6) {
        //         return true;
        //     }
        // }
        // return false;
        return arr[0] == 6 || arr[arr.length - 1] == 6;

    }
    

    // return true if the length of the array is 1 or more 
    //and first and last element are equal.

    public static boolean sameFirstLast(int[] arr) {
        // if (arr[0] == arr[arr.length - 1]) {
        //     return true;
        // }
        // return false;

        return arr[0] == arr[arr.length - 1];
    }



    // return the sum of all the element

    public static int sum3(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) { 
            // arr[i] += sum;
            sum = arr[i] + sum;

        }
        return sum;
         
    }

    // count the numbers of even numbers in the array and return the count.
    public static int countEven(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
           }
       }
       return count;
     }

     /*
     
     given an array of ints return true, if the array have a number 2,
     next to a number 2 or a 4 next to a 4, but not both.
     either24([1,2,2]) -- true;
     either24([4,4,1]) --> true
     either24([4,4,1,2,2])--> false;
     */


     public static boolean either24(int[] arr) {

        //  for (int i = 0; i < arr.length; i++) {
        //      if (arr[i] == 2 && arr[i + 1] == 2 
        //              || arr[i] == 4 && arr[i + i] == 4 
        //      || arr[i] == 2 && arr[i + 1] == 4) {
        //          return true;
        //      }
             
        //  }
        //  return false;

        boolean twos = false;
        boolean fours = false;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 2 && arr[i + 1] == 2) {
                twos = true;
            }
            if (arr[i] == 4 && arr[i + 1] == 4) {
                fours = true;
            }
        }
        return twos != fours;
     }


     /*
     given an array of ints , return true if the array
     have either 3 even or 3 odd values, all next to each other.
     
     modThree([2,1,3,5]) ----> true
     modThree([2,1,2,5]) ----> false
     modThree([2,4,2,5]) ----> true
     
     */

     public static boolean modThree(int[] arr) {
        //  for (int i = 0; i < arr.length; i++) {
        //      if (arr[i + 1] % 2 == 0 || arr[i + 1] % 2 != 0) {
        //          return true;
        //      }
        //  }
        //  return false;

         

         for (int i = 0; i < arr.length - 1; i++) {
             if (arr[i] % 2 == 0 && arr[i + 1] % 2 == 0 && arr[i + 2] % 2 == 0) {
                return  true;
             }
             if (arr[i] % 2 != 0 && arr[i + 1] % 2 != 0 && arr[i + 2] % 2 != 0) {
                return  true;
             }
             
         }
         return false;
     }

    

    


}