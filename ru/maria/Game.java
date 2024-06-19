package ru.maria;

import java.util.Random;

public class Game {
    private boolean[] doors = new boolean[]{false, false, false};

    public Game() {
        int heavenNumber = new Random().nextInt(0, 3);
        doors[heavenNumber] = true;
    }

    public boolean gameResult(boolean change) {
        int chosenDoor = new Random().nextInt(0, 3);
        if (!change) {
            return doors[chosenDoor];
        }
        return !doors[chosenDoor];

    }
}
