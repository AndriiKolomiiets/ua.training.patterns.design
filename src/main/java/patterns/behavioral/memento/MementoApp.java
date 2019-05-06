package patterns.behavioral.memento;

import patterns.behavioral.memento.caretaker.File;
import patterns.behavioral.memento.originator.Game;

public class MementoApp {
        private static String LEVEL_1 = "LVL 1";
        private static String LEVEL_2 = "LVL 2";

    public static void main(String[] args) {
        Game game = new Game();
        game.setGame(LEVEL_1, 30000);
        System.out.println(game);

        File file = new File();
        file.setSave(game.save());

        game.setGame(LEVEL_2, 111000000);
        System.out.println(game);

        game.load(file.getSave());
        System.out.println(game);
    }
}
