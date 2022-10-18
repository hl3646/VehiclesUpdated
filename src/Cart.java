public class Cart extends Light
{
    protected double chargeTime;

    public Cart(String carNumber, int age, int wheelAmount, String steeringWay, double emissionsPerMinute, boolean hasEngine, double chargeTime) {
        super(carNumber, age, wheelAmount, steeringWay, emissionsPerMinute, hasEngine);
        this.chargeTime = chargeTime;
    }

    public double getChargeTime() {
        return chargeTime;
    }

    public void setChargeTime(double chargeTime) {
        this.chargeTime = chargeTime;
    }

    @Override
    public double exhaust() {
        return (super.exhaust() + (this.chargeTime * 30));
    }

    public int hitchhikers()
    {
        return (int)this.chargeTime/2;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "chargeTime=" + chargeTime +
                ", hasEngine=" + hasEngine +
                ", carNumber='" + carNumber + '\'' +
                ", age=" + age +
                ", wheelAmount=" + wheelAmount +
                ", steeringWay='" + steeringWay + '\'' +
                ", emissionsPerMinute=" + emissionsPerMinute +
                '}';
    }
}
