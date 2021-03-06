package less_7.task_07.classes;

public abstract class Person {
    private String name;
    private int hp;
    private int speedRun;
    private int highJump;

    public Person(String name, int hp, int speedRun, int highJump) {
        this.name = name;
        this.hp = hp;
        this.speedRun = speedRun;
        this.highJump = highJump;
    }

    public Person(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.speedRun = 1;
        this.highJump = 10;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getSpeedRun() {
        return speedRun;
    }

    public int getHighJump() {
        return highJump;
    }
}
