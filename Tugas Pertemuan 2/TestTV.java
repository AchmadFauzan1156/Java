public class TestTV {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.turnon();
        tv1.setChannel(30);
        tv1.setVolume(3);

        TV tv2 = new TV();
        tv2.turnon();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();

        System.out.println("tvl's channel is " + tv1.channel
                + " and volume level is " + tv1.volumeLevel);
        System.out.println("tv2's channel is " + tv2.channel
                + " and volume level is " + tv2.volumeLevel);

        // ===== PENGUJIAN MANUSIA =====
        Manusia man1 = new Manusia("Erik");
        System.out.println(man1.namaSaya());

        TV tvku = new TV();
        man1.beliTV(tvku);

        //cek TV sebelum dijual
        System.out.println(man1.cekTV() ? "True" : "False");

        man1.jualSemuaTV();

        //cek TV sesudah dijual
        System.out.println(man1.cekTV() ? "True" : "False");
    }
}