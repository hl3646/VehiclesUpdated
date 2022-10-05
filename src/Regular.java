public class Regular extends Vehicles
{
    protected int passengerAmount;

    public Regular(String carNumber, int age, int wheelAmount, String steeringWay, double emissionsPerMinute, int passengerAmount) {
        super(carNumber, age, wheelAmount, steeringWay, emissionsPerMinute);
        this.passengerAmount = passengerAmount;
    }

    public int getPassengerAmount() {
        return passengerAmount;
    }

    public void setPassengerAmount(int passengerAmount) {
        this.passengerAmount = passengerAmount;
    }

    @Override
    public String toString() {
        return "Regular{" +
                "passengerAmount=" + passengerAmount +
                ", carNumber='" + carNumber + '\'' +
                ", age=" + age +
                ", wheelAmount=" + wheelAmount +
                ", steeringWay='" + steeringWay + '\'' +
                ", emissionsPerMinute=" + emissionsPerMinute +
                '}';
    }
}
