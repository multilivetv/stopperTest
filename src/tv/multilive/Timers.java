package tv.multilive;

public class Timers
{
    private int seconds,minutes;
    public String sSeconds,sMinutes;

    public int getSeconds()
    {
        return seconds;
    }
    public int getMinutes()
    {
        return minutes;
    }
    public String getSSeconds()
    {
        return sSeconds;
    }
    public String getSMinutes()
    {
        return sMinutes;
    }
    public void Starten()
    {
        seconds++;
        if (seconds < 10)
            sSeconds = "0" + seconds;
        else if (seconds > 9) {
            sSeconds = String.valueOf(seconds);
            if (seconds == 60) {
                minutes++;
                if(minutes < 10){
                    sMinutes = "0" + String.valueOf(minutes);
                }
                else if(minutes > 9){
                    sMinutes = String.valueOf(minutes);
                }
                seconds = 0;
                sSeconds = "00";
            }
        }
    }

    public Timers()
    {
        seconds=0;
        minutes=0;
        sSeconds="00";
        sMinutes="00";
    }
}