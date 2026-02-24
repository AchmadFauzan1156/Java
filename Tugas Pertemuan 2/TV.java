public class TV {
    // Data/Variabel
    int channel = 1; //default channel 1
    int volumeLevel = 1; //default volume level 1
    boolean on = false; //default TV off

    public TV()
    {
    }

    public void turnon()
    {
        on = true;
    }

    public void turnoff()
    {
        on = false;
    }

    public void setChannel(int newChannel)
    {
        if (on && newChannel >= 1 && newChannel <=120)
            channel = newChannel;
    }
    public void setVolume(int newVolumeLevel)
    {
        if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
            volumeLevel = newVolumeLevel;
    }

    public void channelUp()
    {
        if (on && channel < 120)
            channel++;
    }

    public void channelDown()
    {
        if (on && channel > 1)
            channel--;
    }

    public void  volumeUp()
    {
        if (on && volumeLevel < 7)
            volumeLevel++;
    }

    public void  volumeDown()
    {
        if (on && volumeLevel > 1 )
            volumeLevel--;
    }
}