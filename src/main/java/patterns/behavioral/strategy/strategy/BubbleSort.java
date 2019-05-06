package patterns.behavioral.strategy.strategy;

import java.util.Arrays;

/**
 * Bubble sorting patterns.behavioral.strategy
 * */
public class BubbleSort implements Sorting {
    @Override
    public void sort(int[] array) {
        System.out.println(">>BubbleSorting\nBefore: " + Arrays.toString(array));
        for (int barrier = array.length - 1; barrier > 0; barrier--){
            for (int i = 0; i<barrier; i++){
                if (array[i]>array[i+1]){
                    int temp = array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                }
            }
        }
        System.out.println("After: \t"+ Arrays.toString(array));
    }
}
