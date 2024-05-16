import java.util.Arrays;

public class soltn {
    
        public static void reverseString(String[] s ,int start,int end){
            while(start < end){
                String temp = s[start];
                s[start] = s[end];
                s[end] = temp;
                start++;
                end--;
            }
            System.out.println(Arrays.toString(s));
            
        }
        public static void main(String[] args) {
            
    
            String[] a ={"h","e;","l","l","o"};
            reverseString(a ,0,a.length-1);
    
            
    
            
            
        }
    
}
