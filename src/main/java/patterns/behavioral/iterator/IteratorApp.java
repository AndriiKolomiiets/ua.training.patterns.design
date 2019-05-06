package patterns.behavioral.iterator;

import patterns.behavioral.iterator.model.Iterator;
import patterns.behavioral.iterator.model.Tasks;

/**
 * Iterator or Cursor pattern
 * */
public class IteratorApp {

    public static void main(String[] args) {
        String[] tasksArray = {"Get connection", "Start transaction", "End transaction", "Close connection"};
        Tasks tasks = new Tasks(tasksArray);
        Iterator iterator = tasks.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
