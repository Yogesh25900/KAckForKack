import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;
public class coding {
    public static void sortArray() {
        int[] numArray = {1789,2035,1899,1456,2013};
        // Arrays.sort(numArray);
        // System.out.println("Sorted array: " + Arrays.toString(numArray));
        
        int result = 0;
        for(int num:numArray) {
            result += num;
        }
        System.out.println("Sum is " + result);
    }

    public void avgArray() {
        int[] numArray = {20, 30, 25, 35, -16, 60, -100};
        int result = 0;

        for(int num:numArray){
            result += num;


        }
        System.out.println("Avg is " + result/numArray.length);




    }

    public void checkArray() {
        String[] name = {"Yogesh","Shahina","Shristi","Manavi"};
        for(String names:name){

            if(names.toUpperCase().equals("YOGESH")){
                System.out.println("Found");
            }

        }
    }

    public static void findIndex(){
        int[] nums   = {2,4,8,6,10};
        for(int index =0; index < nums.length;index++){
            if(nums[index]==10){
                System.out.println("Value:" + nums[index]+"Index:"+index);
            }

        }
    }
    public static void removeElement(int[]Myarray,int element){
        // int[] newArray = new int[Myarray.length-1];
        for(int i = 0; i < Myarray.length-1; i++){
            Myarray[i] = Myarray[i+1];
            
        }

        // for(int index =0; index < Myarray.length; index++){
        //     if(Myarray[index] ==(element)){
        //         continue;
                
        // }else{
        //     System.arraycopy(Myarray,0,newArray,0,newArray.length);
        // }

    
        }
    public static void copyArray(){
        int[] originalArray = {1,2,3,4,5,6,7,8,9};
        int[] newArray = new int[originalArray.length];
        System.arraycopy(originalArray, 0, newArray, 0, originalArray.length);
        System.out.println("Array copied: "+ Arrays.toString(newArray));
    }

    public static void insertElement(){
        int[] Myarray = {1,2,3,4,5};
        int add_element = 10;
        int[] newArray = new int[Myarray.length+1];
        for(int i = 0; i < Myarray.length+1; i++) {
                    
            if(i == 2){
                newArray[i] = add_element;
                // newArray[i+1] = Myarray[i];
            }else if(i>2){
            newArray[i] = Myarray[i-1];
        }else{
            newArray[i] = Myarray[i];
        }
        }
        System.out.println("New array : "+ Arrays.toString(newArray));
}

    public static void findMinMax(){
    int[] newArray = {1,2,3,4,5,6,7,8,9,10};
    int max = newArray[0];
    for(int i = 1; i < newArray.length; i++){
        if(newArray[i] > max){
            max = newArray[i];
    }}
    System.out.println("The maximum element is " + max);

  
    }
    public static void reverse(String[] newArray,int start, int end){
        // String[] oldArray = new String[newArray.length];

        // for(int i = newArray.length-1;i>=0; i--){
        //     for(int j = 0;j< oldArray.length;j++){
        //         if(i+j == newArray.length-1){
        //             oldArray[j] = newArray[i];

        //         }}
                


        // }
        // System.out.println("Old array is " + Arrays.toString(oldArray));
        if(start >=end){
            System.out.println("array is " + Arrays.toString(newArray));
        }else{
            String tempMem = newArray[start];
            newArray[start] = newArray[end];
            newArray[end] = tempMem;
            
            reverse(newArray,start+1, end-1);
        }
        }

    public static void checkDuplicate(){
        int[] Num = {1,2,8,3,4,5,5,6,7,8};
        for(int j = 0; j < Num.length-1; j++){
            for(int i=j+1;i<Num.length;i++){
            
                    if(Num[i] == Num[j] && i!=j){
                        System.out.println("Duplicate at "+ i+" "+ j+"Value:"+Num[i]);
                }

                
            }
        
    }}

    public static void secondlargest(){
        int[] Num = {32,45,56};
        int large = Num[0];
        int second=0;
        for(int nums:Num){
            if(nums > large){
                large = nums;
                
            }
        }
        for(int nums:Num){
            if(nums > second && nums <large){
                second = nums;
        }}

        System.out.println("Seocnd is"+ second);
    
}
public static void addMatrix(){
    int[][] a = {{1,2},{3,4}};
    int[][]b = {{5,6},{6,7}};
    int[][] addition= new int[2][2];
    // System.out.println(a[0].length);
    for(int i= 0;i < a.length;i++){
        for(int j=0;j < a[i].length;j++){
            addition[i][j] = a[i][j]+ b[i][j];
            System.out.println(addition[i][j]);

    }
}
for(int[] additions: addition){
    System.out.println("Addition is"+ Arrays.toString(additions)+"\n");
}
}

public static void Arraytoarraylist(){
    int[] array = {1,2,3,4,5,6,7};
    ArrayList<Integer> list = new ArrayList<>();
    for(int nums: array){
        list.add(nums);
    }
    System.out.println(list);
}

public static int BinarySearch(int[]array,int target,int start,int end){
    if(start <=end){
    int middle = start+(end-start) / 2;
    if(array[middle]==target){
        return middle;

    }else if(target > array[middle]){
        return BinarySearch(array, target, middle+1, end);
    }else {
        return BinarySearch(array, target, start, middle -1);
    }}
    else{
        return -1;
    }
    // System.out.println("Found at"+ middle);

}


public static void findDuplicate(int[]array){
    HashSet<Integer> duplicates = new HashSet<>();
    HashSet<Integer> set = new HashSet<>();
    for(int i:array){
        if(!set.add(i)){
            duplicates.add(i);
        }
    }
    System.out.println(duplicates);


}
public static void productExceptSelf(){
    int[] nums = {0,1};
    int[] array = new int[nums.length];
    for(int i = 0;i < nums.length;i++){
        array[i] =1;

        for(int j =0;j<nums.length;j++){
            if(i !=j){
                array[i] = array[i]*nums[j];
            }else{
                continue;
            }
        }
    }
    for(int ele:array){
        System.out.print(ele + " ");
    }}


public static  int fibonacci(int n){
    //  int a=0;
    //  int b=1;
        
    // while(a < 10){
    //     int c = a+b;
    //     System.out.println(a);
    //     a =b;
    //     b =c;

        

     
    // if(a > end){
    //     return 0;}
    // else{
    //     int c = a+b;
    //     System.out.print(a+" ");
    //     return fibonacci(b, c, end);

    // }
    if (n <= 1) {
        return n; // Base case: Fibonacci of 0 is 0, Fibonacci of 1 is 1
    } else {
        return fibonacci(n - 1) + fibonacci(n - 2); //


}}

public static void swapNode(){
    int[] list = {1,2,3,4};
    
}

public static int countFactors(int n) {
    // Write your code here
        int count =0;
        for(int i =1;i<=n;i++){
            if(i%3 ==0 && i %5 ==0){
                count++;
            }
        }

    return count;

}

    public static void main(String[] args) {
        // coding Printavg = new coding();
        // Printavg.avgArray();
        // coding check = new coding();
        // check.checkArray();
        // findIndex();
        // int[] array = {1,2,3,4,5};
        // removeElement(array, 5);
        // copyArray();
        
        // insertElement();
        String[] newArray = {"Y","O","G","E"};

        // reverse(newArray,0,newArray.length-1);   
        // checkDuplicate();   
        // secondlargest(); 
        // addMatrix();
        // Arraytoarraylist();
        int[] numbers = {1,2,3,4,5,6,7,6,3,4};

        // int bs =BinarySearch(numbers,6,0, 7);
        // System.out.println("found at"+bs);
        // findDuplicate(numbers);
        // int index = Arrays.binarySearch(numbers,3);
        // for(int i = 0; i < 10; i++){
        //     System.out.print(fibonacci(i)+" ");
        // }
        // System.out.println("Found at"+index);
        productExceptSelf();
        // System.out.println(countFactors(15));

       
}
}