package Threes;

import java.util.List;

//  Design a function that takes a list of integers as input. The function should
//  return True if the list contains two consecutive threes (3 next to a 3) anywhere
//  within the list. Otherwise, it should return False. For example, the function
//  should return True for [1, 3, 3] and False for [1, 3, 1, 3].

public class consecutive3 {

    public static boolean isConsecutive(List<Integer> a){
        if(!a.contains(3))
            return false;
        for(int i=0; i<a.size()-1; i++){
            if(a.get(i).equals(a.get(i+1)) && a.get(i) == 3) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        List<Integer> list = List.of(1,3,3,2,2,1);
        List<Integer> list2 = List.of(1,3,2,3,2,1);
        if (isConsecutive(list)) System.out.println("Consecutive 3s found");
        else System.out.println("Not Consecutive 3s found");
        if (isConsecutive(list2)) System.out.println("Consecutive 3s found");
        else System.out.println("No Consecutive 3s found");
    }
}
