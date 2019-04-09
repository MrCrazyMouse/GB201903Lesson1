package gbjavacore.lesson1.course;

import gbjavacore.lesson1.Participant;

public class Water extends Obstacle {

    private int distance;

    public Water(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Participant participant) {
        participant.swim(this.distance);
    }
}
