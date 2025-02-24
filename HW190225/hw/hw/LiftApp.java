package org.telran.lecture_11_greedy_practice.practice.hw;

import java.util.Arrays;

public class LiftApp {

    public static void main(String[] args) {
        Lift liftA = new Lift("A",4,3);
        Lift liftB = new Lift("B",8,2);
        Lift liftC = new Lift("C",5,1);
        Lift liftD = new Lift("D",9,4);

        LiftSystem liftSystem = new LiftSystem(Arrays.asList(liftA, liftB, liftC, liftD));

        int targetFloor = 1;
        Lift fastestLift = liftSystem.getFastestLift(targetFloor);

        System.out.println("Отправляем лифт " + fastestLift.getName());
    }
}
