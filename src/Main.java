public class Main
{
    public static void main(String[] args) {

    }

    public static double getEmmisions(Vehicles[] arr)
    {
        double totalEmmisions = 0;
        int i = 0;
        int len = arr.length;
        for(i = 0; i < len; i++)
        {
            totalEmmisions += arr[i].exhaust();
        }
        return totalEmmisions;
    }

    public static void noises(Vehicles[] arr)
    {
        int i = 0;
        int len = arr.length;
        for(i = 0; i < len; i++)
        {
             if(arr[i] instanceof Regular)
             {
                 ((Regular) arr[i]).noise();
             }
        }
    }

    public static int passengersWithoutDriver(Vehicles[] arr)
    {
        int totalPassengers = 0;
        int i = 0;
        int len = arr.length;
        for(i = 0; i < len; i++)
        {
            if(arr[i] instanceof Regular)
            {
                totalPassengers += ((Regular) arr[i]).getPassengerAmount() - 1;
            }
        }
        return totalPassengers;
    }

    public static double biggestChargeTime(Vehicles[] arr)
    {
        int place = 0;
        double biggestChargingTime = 0;
        int i = 0;
        int len = arr.length;
        for(i = 0; i < len; i++)
        {
            if(arr[i] instanceof Cart)
            {
                if(((Cart) arr[i]).getChargeTime() > biggestChargingTime)
                {
                    biggestChargingTime = ((Cart) arr[i]).getChargeTime();
                    place = i;
                }
            }
        }
        return place;
    }
}