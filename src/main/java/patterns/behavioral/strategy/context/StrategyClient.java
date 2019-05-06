package patterns.behavioral.strategy.context;

import patterns.behavioral.strategy.strategy.Sorting;

/**
 * Context
 */
public class StrategyClient {
    private Sorting strategy;

    public void setStrategy(Sorting strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(int[] array) {
        strategy.sort(array);
    }
}
