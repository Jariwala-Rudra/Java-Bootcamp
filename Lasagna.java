public class Lasagna {
    static final int DEFAULT_COOKING_TIME = 40;
    //Part 1
    private int expectedMinutesInOven() {
        return expectedMinutesInOven;
    }
    //Part 2
    private int remainingMinutesInOven(int actualMinutesInOven) {
        return expectedMinutesInOven - actualMinutesInOven;
    }
    private int preparationTimeInMins (int amtOfLayers) {
        return amtOfLayers * 2;
    }
    //Part 3
    private int totalTimeInMinutes(int amtOfLayers, int actualMinutesInOven) {
        return preparationTimeInMins(amtOfLayers) + actualMinutesInOven;
    }
}