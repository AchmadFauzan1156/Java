public class UjiKendaraan {
    public static void main(String[] args) {
        // Pengujian dengan Dynamic Binding
        Vehicle sepeda = new Bicycle();
        Vehicle mobil = new Car();
        Vehicle motor = new MotorCycle();

        System.out.println("=== Pengujian Bicycle ===");
        sepeda.color = "Merah";
        sepeda.speed = 15.5;
        System.out.println("Warna: " + sepeda.color + " | Kecepatan: " + sepeda.speed);
        sepeda.turnLeft();
        // Menggunakan downcasting untuk mengakses method spesifik milik Bicycle
        ((Bicycle) sepeda).ringBell();

        System.out.println("\n=== Pengujian Car ===");
        mobil.color = "Hitam";
        mobil.speed = 80.0;
        // Downcasting untuk mengakses properti dari MotorVehicle dan Car
        Car mobilCasted = (Car) mobil;
        mobilCasted.sizeofEngine = 4;
        mobilCasted.licencePlate = "B 5151 XYZ";
        mobilCasted.setSeatbelt(true);
        System.out.println("Warna: " + mobilCasted.color + " | Kecepatan: " + mobilCasted.speed);
        System.out.println("Plat Nomor: " + mobilCasted.getLicencePlate() + " | Mesin: " + mobilCasted.getSizeofEngine());
        System.out.println("Sabuk pengaman terpasang? " + mobilCasted.getSeatbelt());
        mobil.turnRight();

        System.out.println("\n=== Pengujian MotorCycle ===");
        motor.color = "Biru";
        motor.speed = 60.0;
        // Downcasting untuk mengakses properti dari MotorVehicle dan MotorCycle
        MotorCycle motorCasted = (MotorCycle) motor;
        motorCasted.licencePlate = "H 1331 ABC";
        motorCasted.setGearFoot(3);
        System.out.println("Warna: " + motorCasted.color + " | Kecepatan: " + motorCasted.speed);
        System.out.println("Plat Nomor: " + motorCasted.getLicencePlate() + " | Gigi: " + motorCasted.getGearFoot());
        motor.turnLeft();
        
        System.out.println("\n=== Memanggil Static Method Kendaraan Melaju ===");
        KendaraanMelaju(sepeda);
        KendaraanMelaju(mobil);
        KendaraanMelaju(motor);
    }
    
    // Static Method KendaraanMelaju dengan parameter Vehicle
    public static void KendaraanMelaju(Vehicle v) {
        System.out.print(v.getClass().getSimpleName() + " -> ");
        v.goStraight();
    }

}