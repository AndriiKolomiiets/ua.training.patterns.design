package patterns.behavioral.strategy;

import patterns.behavioral.strategy.context.StrategyClient;
import patterns.behavioral.strategy.strategy.BubbleSort;
import patterns.behavioral.strategy.strategy.InsertSorting;
import patterns.behavioral.strategy.strategy.SelectionSort;

import java.util.Arrays;

/**
 * Strategy of Policy
 * */
public class StrategyApp {
    public static final int[] TEST_ARRAY1 = {1,2,56,5,7,0,0,-2,-7,-100,4000};
    public static final int[] TEST_ARRAY2 = {1,2,56,5,7,0,0,-2,-7,-100,4000};
    public static final int[] TEST_ARRAY3 = {1,2,56,5,7,0,0,-2,-7,-100,4000};

    public static void main(String[] args) {
        StrategyClient strategyClient = new StrategyClient();
        strategyClient.setStrategy(new BubbleSort());
        strategyClient.executeStrategy(TEST_ARRAY1);

        strategyClient.setStrategy(new SelectionSort());
        strategyClient.executeStrategy(TEST_ARRAY2);

        strategyClient.setStrategy(new InsertSorting());
        strategyClient.executeStrategy(TEST_ARRAY3);

        System.out.println("\nImportant difference:\n>> Comparing by EQUALS:");
        System.out.println(TEST_ARRAY1.equals(TEST_ARRAY2));
        System.out.println(TEST_ARRAY2.equals(TEST_ARRAY3));
        System.out.println(">> Comparing by Arrays.EQUALS:");
        System.out.println(Arrays.equals(TEST_ARRAY1,TEST_ARRAY2));
        System.out.println(Arrays.equals(TEST_ARRAY2, TEST_ARRAY3));
    }
}
