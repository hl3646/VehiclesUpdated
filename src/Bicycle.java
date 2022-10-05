public class Bicycle extends Light
{
    protected boolean hasBasket;

    public Bicycle(String carNumber, int age, int wheelAmount, String steeringWay, double emissionsPerMinute, boolean hasEngine, boolean hasBasket) {
        super(carNumber, age, wheelAmount, steeringWay, emissionsPerMinute, hasEngine);
        this.hasBasket = hasBasket;
    }

    public boolean isHasBasket() {
        return hasBasket;
    }

    public void setHasBasket(boolean hasBasket) {
        this.hasBasket = hasBasket;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "hasBasket=" + hasBasket +
                ", hasEngine=" + hasEngine +
                ", carNumber='" + carNumber + '\'' +
                ", age=" + age +
                ", wheelAmount=" + wheelAmount +
                ", steeringWay='" + steeringWay + '\'' +
                ", emissionsPerMinute=" + emissionsPerMinute +
                '}';
    }
}
