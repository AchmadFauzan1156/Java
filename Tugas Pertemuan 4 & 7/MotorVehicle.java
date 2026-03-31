public class MotorVehicle extends Vehicle{
    public int sizeofEngine;
    public String licencePlate;

    public MotorVehicle()
    {
        super();
        this.sizeofEngine = 1;
        this.licencePlate = "H 1 IDN";
    }

    public MotorVehicle(int sizeofEng, String lcPlate)
    {
        super();
        this.sizeofEngine = sizeofEng;
        this.licencePlate = lcPlate;
    }

    public int getSizeofEngine()
    {
        return sizeofEngine;
    }

    public String getLicencePlate()
    {
        return licencePlate;
    }
}