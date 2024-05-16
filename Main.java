import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void findSum() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        
        List<Integer> newList = new ArrayList<>();
        int cumulativeSum = 0;
        
        // Calculate cumulative sum from left to right
        for (int i = 0; i < list.size(); i++) {
            cumulativeSum += list.get(i);
            newList.add(cumulativeSum);
        }
        
        // Reset cumulative sum for right to left calculation
        cumulativeSum = 0;
        
        // Calculate cumulative sum from right to left and update newList
        for (int i = list.size() - 1; i >= 0; i--) {
            cumulativeSum += list.get(i);
            newList.set(i, cumulativeSum);
        }
        
        System.out.println(newList);
    }

    public static void main(String[] args) {
        findSum();
    }
}
