package Exercises;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInArray {

    public List<Integer> findDuplicates(int[] nums) {

        List<Integer>mylist = new ArrayList<>();
        for(int i =0; i < nums.length; i++){
            int n = Math.abs(nums[i]);
            if(nums[n-1] < 0){
                mylist.add(n);
            }else{
                nums[n-1] = -1 * nums[n-1];
            }
        }
        return mylist;
    }
}
