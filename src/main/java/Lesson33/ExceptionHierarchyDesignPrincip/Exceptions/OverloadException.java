package Lesson33.ExceptionHierarchyDesignPrincip.Exceptions;

public class OverloadException extends BikeException {
    public OverloadException() {
        super("The bike is over the weight limit!");
    }
}
