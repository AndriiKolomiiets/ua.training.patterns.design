package patterns.behavioral.strategy.strategy;

import java.util.Arrays;

/**
 * Insert sorting patterns.behavioral.strategy
 * */
public class InsertSorting implements Sorting{
    @Override
    public void sort(int[] array) {
        System.out.println(">>Insert sorting\nBefore: " + Arrays.toString(array));
        for (int barrier = 1; barrier < array.length; barrier++){
            int index = barrier;
            while (index-1>=0 && array[index] < array[index-1]){
                int temp = array[index];
                array[index] = array[index-1];
                array[index-1] = temp;
                index--;
            }
        }
        System.out.println("After: " + Arrays.toString(array));
    }
}
