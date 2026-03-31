public class MotorCycle extends MotorVehicle {
    private int numgear;

    public MotorCycle()
    {
        numgear = 0;
    }

    public void setGearFoot(int numgear)
    {
        this.numgear = numgear;
    }

    public int getGearFoot()
    {
        return numgear;
    }
}