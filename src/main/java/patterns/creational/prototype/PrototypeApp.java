package patterns.creational.prototype;

import patterns.creational.prototype.model.Human;
import patterns.creational.prototype.model.HumanFactory;

public class PrototypeApp {

    public static void main(String[] args) {
        Human humanOriginal = new Human(26, "Mike", "Howth, Ireland");
        HumanFactory factory = new HumanFactory(humanOriginal);

        Human copyOfHuman = factory.makeCopy();
        copyOfHuman.setName("Clone");
        copyOfHuman.setAge(0);
        copyOfHuman.setAddress("Homeless...");

        System.out.println(humanOriginal + "\n========= VS =========\n" + copyOfHuman);
    }
}
