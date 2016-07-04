package dayOne;

/**
 * Created by Student on 27/06/2016.
 */
public class LightSpeed {

    public static void main(String[] args){
        //Evenson et all = calculated 299,792,458 metres / second
        //1 mile = 1609.34 metres

        int lightspeed;
        long days;
        long seconds;
        long distance;

        lightspeed = 186282;
        days = 7;
        //based on number of days
        seconds = days * 24 * 60 * 60;
        distance = lightspeed * seconds;

        System.out.print("In " + days);
        System.out.print(" days light will travel about...");
        System.out.print(distance + " miles.");
    }
}
