public class Vehicle {
    public double speed;
    public String color;

    public Vehicle()
    {
        this.speed = 0;
        this.color = "orange";
    }

    public void goStraight()
    {
        System.out.println("Maju..");
    }

    public void turnLeft()
    {
        System.out.println("Belok Kiri");
    }

        public void turnRight()
    {
        System.out.println("Belok Kanan");
    }
}