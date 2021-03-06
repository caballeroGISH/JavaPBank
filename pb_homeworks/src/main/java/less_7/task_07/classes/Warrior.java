package less_7.task_07.classes;

import less_7.task_07.interfaces.Jumpable;
import less_7.task_07.interfaces.Shootable;

public class Warrior extends Person implements Runnable, Shootable, Jumpable {
    private String type = "Warrior";

    public String getType() {
        return type;
    }

    public Warrior(String name, int hp, int speedRun, int highJump) {
        super(name, hp, speedRun, highJump);
    }

    public Warrior(String name, int hp) {
        super(name, hp);
    }

    @Override
    public String toString() {
        return getType() + " " + super.toString();
    }

    @Override
    public void run() {
        System.out.println(this.toString() + " run with speed " + getSpeedRun());
    }

    @Override
    public void doJump() {
        System.out.println(type + " " + super.toString() + " " + "jumped");
    }

    @Override
    public void doShoot(String s) {
        System.out.println("No shooting...");
    }
}
