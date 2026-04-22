package Lesson33.ExceptionHierarchyDesignPrincip.model;


import Lesson33.ExceptionHierarchyDesignPrincip.Exceptions.*;

public class ChristianiaBike implements Rideable {

    @Override
    public void ride(int tirePressure, boolean brakesWorking) throws BikeException {
        int carryWeight = 10; // simulate weight

        if (carryWeight > 100) {
            throw new OverloadException();
        }

        if (tirePressure < 20) {
            throw new FlatTireException();
        }

        if (!brakesWorking) {
            throw new BrakeFailureException();
        }

        System.out.println("Christiania bike is running smoothly ⚡");
    }
}