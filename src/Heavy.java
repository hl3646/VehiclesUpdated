public abstract class Heavy extends Vehicles
{
    protected int carrierAmount;

    public Heavy(String carNumber, int age, int wheelAmount, String steeringWay, double emissionsPerMinute, int carrierAmount) {
        super(carNumber, age, wheelAmount, steeringWay, emissionsPerMinute);
        this.carrierAmount = carrierAmount;
    }

    public int getCarrierAmount() {
        return carrierAmount;
    }

    public void setCarrierAmount(int carrierAmount) {
        this.carrierAmount = carrierAmount;
    }

    @Override
    public double exhaust() {
        return (super.exhaust() + (500 * this.carrierAmount));
    }

    @Override
    public String toString() {
        return "Heavy{" +
                "carrierAmount=" + carrierAmount +
                ", carNumber='" + carNumber + '\'' +
                ", age=" + age +
                ", wheelAmount=" + wheelAmount +
                ", steeringWay='" + steeringWay + '\'' +
                ", emissionsPerMinute=" + emissionsPerMinute +
                '}';
    }
}
