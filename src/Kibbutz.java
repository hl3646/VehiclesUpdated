public class Kibbutz
{
    protected Vehicles[] arrVehicles = new Vehicles[500];
    protected int VehicleCount;

    public Kibbutz()
    {
        VehicleCount = 0;
    }

    public void addVehicle(Vehicles vehicle)
    {
        arrVehicles[VehicleCount] = vehicle;
        VehicleCount++;
    }

    private Vehicles[] getAllOldCars()
    {
        Vehicles[] arr = new Vehicles[500];
        int j = 0;
        int i = 0;
        for(i = 0; i < 500; i++)
        {
            if(this.arrVehicles[i].getSteeringWay().equals("Steering Wheel") && this.arrVehicles[i].getAge() == 15)
            {
                arr[j] = this.arrVehicles[i];
                j++;
            }
        }
        return arr;
    }


    private int allSteeringWheels()
    {
        int count = 0;
        int i = 0;
        for(i = 0; i < 500; i++)
        {
            if(this.arrVehicles[i].getSteeringWay().equals("Steering Wheel") && (this.arrVehicles[i] instanceof Regular || this.arrVehicles[i] instanceof Light))
            {
                count++;
            }
        }
        return count;
    }
}
