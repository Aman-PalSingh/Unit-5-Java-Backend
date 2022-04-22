package com.Unit5.C2.BinarySearch;

public class BinarySearch {
    Sort SortingAlgoSelectionClass;
    //constructor
//    public BinarySearch(Sort SortingAlgo) {
//        this.SortingAlgoSelectionClass = SortingAlgo;
//    }

    public BinarySearch(Sort sortingAlgoSelectionClass) {
        SortingAlgoSelectionClass = sortingAlgoSelectionClass;
    }

    public void binarySearch(int[] arr, int target){
        SortingAlgoSelectionClass.sortFun(arr);
    }
}
