public class Vehicles
{
    protected String carNumber;
    protected int age;
    protected int wheelAmount;
    protected String steeringWay;
    protected double emissionsPerMinute;

    public Vehicles(String carNumber, int age, int wheelAmount, String steeringWay, double emissionsPerMinute)
    {
        this.carNumber = carNumber;
        this.age = age;
        this.wheelAmount = wheelAmount;
        this.steeringWay = steeringWay;
        this.emissionsPerMinute = emissionsPerMinute;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWheelAmount() {
        return wheelAmount;
    }

    public void setWheelAmount(int wheelAmount) {
        this.wheelAmount = wheelAmount;
    }

    public String getSteeringWay() {
        return steeringWay;
    }

    public void setSteeringWay(String steeringWay) {
        this.steeringWay = steeringWay;
    }

    public double getEmissionsPerMinute() {
        return emissionsPerMinute;
    }

    public void setEmissionsPerMinute(double emissionsPerMinute) {
        this.emissionsPerMinute = emissionsPerMinute;
    }

    @Override
    public String toString() {
        return "vehicles{" +
                "carNumber='" + carNumber + '\'' +
                ", age=" + age +
                ", wheelAmount=" + wheelAmount +
                ", steeringWay='" + steeringWay + '\'' +
                ", emissionsPerMinute=" + emissionsPerMinute +
                '}';
    }
}
