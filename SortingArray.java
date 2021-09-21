import java.util.*;
import java.io.*;

public class SortingArray {

    ArrayList<Integer> arr;

    public SortingArray(){

    arr = new ArrayList<Integer>();
    }

    public void newNum(int n){
        arr.add(n);
    }

    public void sorting(ArrayList<Integer> arr){
        Collections.sort(arr);
    }

}
