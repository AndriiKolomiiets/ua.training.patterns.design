package patterns.behavioral.iterator.model;

/**
 * Concrete aggregate
 */
public class Tasks implements Container {
    String[] tasks;

    public Tasks(String[] tasks) {
        this.tasks = tasks;
    }

    @Override
    public Iterator getIterator() {
        return new TaskIterator();
    }

    private class TaskIterator implements Iterator {
        int index = 0;

        @Override
        public boolean hasNext() {
            if (index < tasks.length){
                return true;
            }
                return false;
        }

        @Override
        public Object next() {
            return tasks[index++];
        }
    }
}
