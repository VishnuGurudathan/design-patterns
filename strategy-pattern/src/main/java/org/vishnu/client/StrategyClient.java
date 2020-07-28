package org.vishnu.client;

import org.vishnu.demo.BubbleSortStrategy;
import org.vishnu.demo.Context;
import org.vishnu.demo.QuickSortStrategy;

/**
 * Class description
 *
 * @author : vishnu.g
 * created on : 24/Jul/2020
 */
public class StrategyClient {
    private Context context;

    public StrategyClient(Context context) {
        this.context = context;
    }

    public static void main(String[] args) {
        Context context = new Context(new BubbleSortStrategy());
        StrategyClient client = new StrategyClient(context);
        client.execute();
    }

    public void execute() {
        context.doSomething();
        context.setStrategy(new QuickSortStrategy());
        context.doSomething();
    }
}
