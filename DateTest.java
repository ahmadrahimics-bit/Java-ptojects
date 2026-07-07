import java.util.*;

public class DateTest {

    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now.toString());

        Date spesific = new Date(100000000000L);
        System.out.println(spesific.toString());
        long milisecond = now.getTime();
        System.out.println(milisecond);
    }
}