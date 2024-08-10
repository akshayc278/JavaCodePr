package com.pack.recursion;

import java.util.Vector;

public class SortAnArray {
    public static void main(String[] args) {
        SortAnArray sortAnArray = new SortAnArray();
        int []array = new int[]{3,1,5,2,0};
        Vector<Integer> v = new Vector<>();
        for (int j : array) {
            v.add(j);
        }

        sortAnArray.sortAnVector(v);
        v.forEach(System.out::print);
    }
    public void sortAnVector(Vector<Integer> v){
        if(v.size() == 1){
            return;
        }
        int value = v.getLast();
        v.removeLast();
        sortAnVector(v);
        insert(value,v);
        return;
    }
    public void insert(int value,Vector<Integer> v){
        if(v.isEmpty() || v.lastElement()<value){
            v.addLast(value);
            return;
        }
        else{
            int last=v.removeLast();
            insert(value,v);
            v.addLast(last);
            return;
        }
    }
}
