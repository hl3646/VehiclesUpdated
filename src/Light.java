public abstract class Light extends Vehicles
{
    protected boolean hasEngine;

    public Light(String carNumber, int age, int wheelAmount, String steeringWay, double emissionsPerMinute, boolean hasEngine) {
        super(carNumber, age, wheelAmount, steeringWay, emissionsPerMinute);
        this.hasEngine = hasEngine;
    }

    public boolean isHasEngine() {
        return hasEngine;
    }

    public void setHasEngine(boolean hasEngine) {
        this.hasEngine = hasEngine;
    }

    @Override
    public String toString() {
        return "Light{" +
                "hasEngine=" + hasEngine +
                ", carNumber='" + carNumber + '\'' +
                ", age=" + age +
                ", wheelAmount=" + wheelAmount +
                ", steeringWay='" + steeringWay + '\'' +
                ", emissionsPerMinute=" + emissionsPerMinute +
                '}';
    }
}
