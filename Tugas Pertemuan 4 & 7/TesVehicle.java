public class TesVehicle {
    public static void main(String[] args)
    {
        System.out.println("===== Uji Bicycle =====");
        Bicycle sepeda = new Bicycle();
        System.out.println("Warna: " + sepeda.color);
        System.out.println("Kecepatan: " + sepeda.speed);
        sepeda.goStraight();
        sepeda.turnLeft();
        sepeda.turnRight();
        sepeda.ringBell();

        System.out.println();
        System.out.println("===== Uji MotorVehicle (default) =====");
        MotorVehicle motor1 = new MotorVehicle();
        System.out.println("Warna: " + motor1.color);
        System.out.println("Kecepatan: " + motor1.speed);
        System.out.println("Jumlah Mesin: " + motor1.getSizeofEngine());
        System.out.println("Plat Nomer: " + motor1.getLicencePlate());
        motor1.goStraight();
        motor1.turnLeft();
        motor1.turnRight();

        System.out.println();
        System.out.println("===== Uji MotorVehicle (parameter) =====");
        MotorVehicle motor2 = new MotorVehicle(2, "B 2 JAK");
        System.out.println("Warna: " + motor2.color);
        System.out.println("Kecepatan: " + motor2.speed);
        System.out.println("Jumlah Mesin: " + motor2.getSizeofEngine());
        System.out.println("Plat Nomer: " + motor2.getLicencePlate());
        motor2.goStraight();
        motor2.turnRight();
    }
}
