package gbjavacore.lesson1.animal;

import gbjavacore.lesson1.Participant;
import gbjavacore.lesson1.enums.Color;

/**
 * Робот не является животным, но может учавствовать в соревнованиях
 * так как реализует интерфейс {@link Participant}
 */
public class Robot implements Participant {

    private String name;
    private Color color;
    private int age;
    private boolean isOnDistance;
    private int runDistance;
    private int jumpHeight;
    private int swimDistance;

    public Robot (String name, Color color, int age, int runDistance, int jumpHeight, int swimDistance) {
        this.isOnDistance = true;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
        this.swimDistance = swimDistance;
    }

    public void voice() {
        System.out.println("I`m R2D2");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Color  getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean isOnDistance() {
        return isOnDistance;
    }

    @Override
    public void run(int distance) {
        if (!isOnDistance) {
            return;
        }
        if (distance > runDistance) {
            isOnDistance = false;
            return;
        }
        System.out.println(String.format("Робот %s пробежал кросс длинной %d", getName(), distance));
    }

    @Override
    public void jump(int height) {
        if (!isOnDistance) {
            return;
        }
        if (height > jumpHeight) {
            isOnDistance = false;
            return;
        }
        System.out.println(String.format("Робот %s пругнул на высоту %d", getName(), height));
    }

    @Override
    public void swim(int distance) {
        if (!isOnDistance) {
            return;
        }
        if (distance > swimDistance) {
            isOnDistance = false;
            return;
        }
        System.out.println(String.format("Робот %s проплыл %d", getName(), distance));
    }

    public void setRunDistance(int runDistance) {
        this.runDistance = runDistance;
    }
}
