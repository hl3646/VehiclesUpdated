public class Tractor extends Heavy
{
    protected String carrierTypes;

    public Tractor(String carNumber, int age, int wheelAmount, String steeringWay, double emissionsPerMinute, int carrierAmount, String carrierTypes) {
        super(carNumber, age, wheelAmount, steeringWay, emissionsPerMinute, carrierAmount);
        this.carrierTypes = carrierTypes;
    }

    public String getCarrierTypes() {
        return carrierTypes;
    }

    public void setCarrierTypes(String carrierTypes) {
        this.carrierTypes = carrierTypes;
    }

    @Override
    public String toString() {
        return "Tractor{" +
                "carrierTypes='" + carrierTypes + '\'' +
                ", carrierAmount=" + carrierAmount +
                ", carNumber='" + carNumber + '\'' +
                ", age=" + age +
                ", wheelAmount=" + wheelAmount +
                ", steeringWay='" + steeringWay + '\'' +
                ", emissionsPerMinute=" + emissionsPerMinute +
                '}';
    }
}
