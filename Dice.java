public class Dice {
    public int Roll() {
        // Rolls 2d6 and returns the total. If a total is found, runs a separate Double method
        int roll1 = (int) (Math.random() * 6 + 1);
        int roll2 = (int) (Math.random() * 6 + 1);
        if (roll1 == roll2) {
            Double();
        }
        return (roll1 + roll2);
    }

    public void Double() {
        System.out.println("WOO YOU GOT A DOUBLEEEEE");
    }

}