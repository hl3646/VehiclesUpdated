public abstract class Truck extends Heavy
{
    protected int maxCarryWeight;

    public Truck(String carNumber, int age, int wheelAmount, String steeringWay, double emissionsPerMinute, int carrierAmount, int maxCarryWeight) {
        super(carNumber, age, wheelAmount, steeringWay, emissionsPerMinute, carrierAmount);
        this.maxCarryWeight = maxCarryWeight;
    }

    public int getMaxCarryWeight() {
        return maxCarryWeight;
    }

    public void setMaxCarryWeight(int maxCarryWeight) {
        this.maxCarryWeight = maxCarryWeight;
    }

    @Override
    public double exhaust() {
        return super.exhaust() * 1.5;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "maxCarryWeight=" + maxCarryWeight +
                ", carrierAmount=" + carrierAmount +
                ", carNumber='" + carNumber + '\'' +
                ", age=" + age +
                ", wheelAmount=" + wheelAmount +
                ", steeringWay='" + steeringWay + '\'' +
                ", emissionsPerMinute=" + emissionsPerMinute +
                '}';
    }
}
