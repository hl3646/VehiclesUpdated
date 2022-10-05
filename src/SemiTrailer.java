public class SemiTrailer extends Truck
{
    protected double length;

    public SemiTrailer(String carNumber, int age, int wheelAmount, String steeringWay, double emissionsPerMinute, int carrierAmount, int maxCarryWeight, double length) {
        super(carNumber, age, wheelAmount, steeringWay, emissionsPerMinute, carrierAmount, maxCarryWeight);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "SemiTrailer{" +
                "length=" + length +
                ", maxCarryWeight=" + maxCarryWeight +
                ", carrierAmount=" + carrierAmount +
                ", carNumber='" + carNumber + '\'' +
                ", age=" + age +
                ", wheelAmount=" + wheelAmount +
                ", steeringWay='" + steeringWay + '\'' +
                ", emissionsPerMinute=" + emissionsPerMinute +
                '}';
    }
}
