package Q1;

public class Passes {

    /** Function calculates the no of times to visit door
     *
     * @param passes
     */
    public void noOfTimesToVisitTheDoor(int passes) {
        System.out.println("Visiting  door # " + passes);

        for (int i = 1; i <= 100; i++) {
            if (i % passes == 0) {
                System.out.println("Door # " + i);
            }
        }
    }
}
