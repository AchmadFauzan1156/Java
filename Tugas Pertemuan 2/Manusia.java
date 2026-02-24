public class Manusia {
    String nama = "noname";
    boolean punyaTV = false; //deafult tidak punya TV

    //constructor kosong 1
    Manusia()
    {
    }

    //constructor 2
    Manusia(String nama)
    {
        this.nama = nama;
    }

    String namaSaya()
    {
        return nama;
    }

    void beliTV(TV Tiviku)
    {
        punyaTV = true;
    }

    void jualSemuaTV()
    {
        punyaTV = false;
    }

    boolean cekTV()
    {
        return punyaTV;
    }
}