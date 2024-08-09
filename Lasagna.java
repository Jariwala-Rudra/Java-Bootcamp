public class Lasagna {
    int expectedMinutesInOven = 40;
    public int expectedMinutesInOven() {
        return expectedMinutesInOven;
    }
    public int remainingMinutesInOven(int actualMinutesInOven) {
        return expectedMinutesInOven - actualMinutesInOven;
    }
    public int preparationTimeInMins (int amtOfLayers) {
        return amtOfLayers * 2;
    }
}
