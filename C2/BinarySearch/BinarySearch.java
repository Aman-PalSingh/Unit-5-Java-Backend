package com.Unit5.C2.BinarySearch;

public class BinarySearch {
    Sort sortArray;

    public BinarySearch(Sort sort) {
        this.sortArray = sort;
    }

    public void SearchSelect(int[] arr, int target){
        sortArray.sortFun(arr);

    }
}
