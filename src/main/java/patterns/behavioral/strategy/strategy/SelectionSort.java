package patterns.behavioral.strategy.strategy;

import java.util.Arrays;

/**
 * Selection sort patterns.behavioral.strategy
 * */
public class SelectionSort implements Sorting{
    @Override
    public void sort(int[] array) {
        System.out.println(">>Selection sorting\nBefore" + Arrays.toString(array));
        for (int barrier = 0; barrier<array.length-1; barrier++){
            for (int i = barrier+1; i < array.length; i++){
                if (array[i]<array[barrier]){
                    int temp = array[i];
                    array[i] = array[barrier];
                    array[barrier] = temp;
                }
            }
        }
        System.out.println("After: " + Arrays.toString(array));
    }
}
