package patterns.behavioral.templatemethod.model;

/**
 * An abstract class with similar to all subclasses methods
 * It consists an abstract method inside, which can be specified in order to change some part of templateMethod().
 * */
public abstract class LogManager {
    public void templateMethod(String inputData){
        String log = processSomeSmartLogicAndGetLog(inputData);
        printLog(log);
    }

    public abstract void printLog(String log);

    private String processSomeSmartLogicAndGetLog(String inputData){
        //Some smart unimportant logic is here
        return "Current method has processed data with a complicated, common to all subclasses logic.\n" + inputData + "...";
    }
}
