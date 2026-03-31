public class Car extends MotorVehicle {
    private boolean seatbelt;

    public Car()
    {
        seatbelt = false;
    }

    public void setSeatbelt(boolean seatbelt)
    {
        this.seatbelt = seatbelt;
    }

    public boolean getSeatbelt()
    {
        return seatbelt;
    }
}