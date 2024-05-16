import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class solution {
    public static void returnArray(int n){
        int[] array = new int[n];
        for(int i = 0; i <n; i++){
            array[i] =i;
        }
        System.out.println(Arrays.toString(array));
    }
    public static List<Integer> productExceptSelf(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        int product = 1;

        // Calculate product of all elements to the left of each element
        for (int i = 0; i < nums.size(); i++) {
            result.add(product);
            product *= nums.get(i);
        }

        product = 1;
        
        // Calculate product of all elements to the right of each element and update the result list
        for (int i = nums.size() - 1; i >= 0; i--) {
            result.set(i, result.get(i) * product);
            product *= nums.get(i);
        }

        return result;
    }

    public static void birthdatCakeCandles(int n, int[] candles){
        int max_unit = candles[0];
        int count =0;

        for (int i = 0; i < candles.length;i++){
            if(candles[i] !=max_unit){
                if(candles[i] >  max_unit){
                    max_unit = candles[i];
                    
                }}else{
                    count++;
                }

        }
        System.out.println(count);
    }
    public static void findOccurence(int n , String sen ,int find, String word){
            // Get the lengths of the string and the substring
            int strLength = sen.length();
            int subLength = word.length();
    
            // Iterate through the string
            int count = 0;
            for (int i = 0; i <= strLength - subLength; i++) {
                // Check if the substring starting from index i matches the target substring
                if (sen.substring(i, i + subLength).equals(word)) {
                    if ((i == 0 || sen.charAt(i - 1) == ' ') && (i + subLength == strLength || sen.charAt(i + subLength) == ' ')) {

                    count++; // Substring found
                }}
            }
         // Substring not found
         System.out.println(count);
        }

        public static void sum(int n){
            ArrayList<Integer> list = new ArrayList<>();
            for(int i =0;i<n;i++){
                if(i %3 ==0 || i% 5 ==0){
                    list.add(i);
                    
                }
            }
            int add =0;
            for(int num: list){
                add=add+num;
                
            }
            System.out.println(add);
        }
        public static void filledOrders(int n,List<Integer> order, int k) {
            // Write your code here
                int total =0;
                int count =0;
                for(int i =0 ; i< order.size();i++){
                    total = total+ order.get(i);
                    if(total ==k){
                        count++;
                    }else{
                        continue;
                    }
                    
                }System.out.println(count+1);
                
            
        
            }
    

    public static void findSum(){
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(3);
        List<Integer> newList = new ArrayList<>();
        for(int i =0 ; i< list.size();i++){
            int sum = 0;
            for(int j =0 ; j< list.size();j++){
                if(i!=j){
                    sum = sum+ list.get(j);


                }else{
                    continue;
                }
            }newList.add(sum);
        }
        

        
        System.out.println(newList.toString());

        
    }
    public static void findProduct(){
        List<Integer> list = new ArrayList<>();
        List<Integer> newList = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        for(int i =0 ; i< list.size();i++){
            int product =1;

            for(int j=0;j< list.size();j++){
                if(i!=j){
                    product*=list.get(j);


                }else{
                    continue;
                }
            }
            newList.add(product);
            product =1;
        }
        System.out.println(newList);
    }
    public static void findSubstring(String string,String subString){
        boolean checkString = true;
        
       for(int i =0 ; i< subString.length();i++){
        char check = Character.toLowerCase(subString.charAt(i));
        System.out.println(check);
        if(string.indexOf(check)==-1){
            checkString = false;
            break;

        }

       }
       if(checkString){
        System.out.println("Found");
       }else{
        System.out.println("Not found");
       }

    }
    public static void perfectSqr(int start,int end){
        
            for(int i =1; i<end;i++){
                if((i*i)>=start&& (i*i)<end){
                    System.out.println(i*i);
                }
            }
        
    }
    public static void alternateCase(String name){
        String str = "";
        for(char i: name.toCharArray()){
            if(Character.isLowerCase(i)){
                str =str+Character.toUpperCase(i);

            }else{
                str =str+Character.toLowerCase(i);
            }

        }
        System.out.println(str);


    }
    public static void matrixDiagonal(){
        int[][] matrix = {
            {1,2,3,8},
            {4,5,6,7},
            {7,8,9,6},
            {5,4,2,3}
        };
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) { // Only swap elements on the main diagonal
                    int temp = matrix[i][i];
                    matrix[i][i] = matrix[i][n - 1 - i];
                    matrix[i][n - 1 - i] = temp;
                }
            }
        }
        for(int[]a : matrix){
        System.out.println(Arrays.toString(a));
        }

    }
    public static int sumdigits(int number){
        List<Integer> list = new ArrayList<>();
        String num = String.valueOf(number);
        for(int  i=0;i<num.length();i++){
            int digit = Character.getNumericValue(num.charAt(i));
            list.add(digit);
        }
        int sum=0;
        for(int digits:list){
            if(digits %2 ==0){
                int q = digits / 2;
            
                sum = sum + q;
            }
            else{
                sum =sum+ digits;
            }
            }
            if(sum >9){
                return sumdigits(sum);

            }
        
        return sum;

    }

    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // List<Integer> list = new ArrayList<>();

        // // Read integers until non-integer input is encountered
        // while (in.hasNextInt()) {
        //     int addnum = in.nextInt();
        //     list.add(addnum);
        // }

        // // Call the productExceptSelf function and print the result
        // List<Integer> result = productExceptSelf(list);
        // for (int ele : result) {
        //     System.out.print(ele + " ");
        // }

        // // Close the scanner
        // in.close();
        // Scanner in = new Scanner(System.in);
        // int nums = in.nextInt();
        // int[] array = new int[nums];
        // for(int i =0;i<nums;i++){
        //     int number= in.nextInt();
        //     array[i]= number;
        
        // }
        // birthdatCakeCandles(nums,array);
        // in.close();
        // findOccurence(1,"Swimming walking ", 1, "in");
        // int t = in.nextInt();
        // sum(t);
        // List<Integer> list = new ArrayList<>();
        //  Scanner in = new Scanner(System.in);
        //  int no = in.nextInt();
        //  for(int i=0;i<no;i++){
        //      int addele = in.nextInt();
        //      list.add(addele);
             
        //  }
        //  int widgets = in.nextInt();
        //  filledOrders(no,list,widgets);
        //  in.close();
        // findProduct();
        // String string = in.nextLine();
        // System.out.println("What you wanna search\n");
        // String subString = in.nextLine();

        // findSubstring(string,subString);
        // perfectSqr(10, 20);
        // alternateCase("Hello World");
        // matrixDiagonal();
        System.out.println(sumdigits(456 ));
    }
}
