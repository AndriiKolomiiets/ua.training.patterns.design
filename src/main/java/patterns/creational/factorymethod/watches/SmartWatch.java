package patterns.creational.factorymethod.watches;

public class SmartWatch implements Watch {
    public void showTime() {
        System.out.println("Here must be a smart time, but people aren't ready for this...");
        showBurnedCallories();
    }
    public void showBurnedCallories(){
        System.out.println("You burned a lot of calories, but still a lot of them survived!..");
    }
}
