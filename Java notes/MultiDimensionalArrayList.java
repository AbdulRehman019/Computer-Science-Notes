package com.Abdul;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // This will create a 2D array.
        // A list variable will be formed in stack which will point to the reference variables(which is actually itself a array) in heap (After the first line)

        // Initialization
        for(int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        // After initialization, the reference variable in heap will point to the array at some other location in heap.

        // Add elements
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list);

    }
}
