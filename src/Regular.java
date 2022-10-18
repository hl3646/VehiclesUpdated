public abstract class Regular extends Vehicles
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
    public double exhaust() {
        return (super.exhaust() + (150 * this.passengerAmount));
    }

    public void noise()
    {
        System.out.println("vroom vroom");
    }

    public int hitchhikers()
    {
        return ((int)this.passengerAmount/2);
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
