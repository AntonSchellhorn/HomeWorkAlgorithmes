package org.telran.lecture_11_greedy_practice.practice.hw;

import java.util.List;

public class LiftSystem {
    private List<Lift> lifts;

    public LiftSystem(List<Lift> lifts) {
        this.lifts = lifts;
    }

    public Lift getFastestLift(int targetFloor) {
        Lift fastestLift = lifts.get(0);
        int minTime = fastestLift.getArrivalTime(targetFloor);

        for (Lift lift : lifts) {
            int time = lift.getArrivalTime(targetFloor);
            if (time < minTime) {
                fastestLift = lift;
                minTime = time;
            }
        }
        return fastestLift;
    }
}
