public class SUVs extends Regular
{
    protected int horsepower;

    public SUVs(String carNumber, int age, int wheelAmount, String steeringWay, double emissionsPerMinute, int passengerAmount, int horsepower) {
        super(carNumber, age, wheelAmount, steeringWay, emissionsPerMinute, passengerAmount);
        this.horsepower = horsepower;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public String toString() {
        return "SUVs{" +
                "horsepower=" + horsepower +
                ", passengerAmount=" + passengerAmount +
                ", carNumber='" + carNumber + '\'' +
                ", age=" + age +
                ", wheelAmount=" + wheelAmount +
                ", steeringWay='" + steeringWay + '\'' +
                ", emissionsPerMinute=" + emissionsPerMinute +
                '}';
    }
}
