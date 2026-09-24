import java.lang.System;
import java.util.*;

class Time {
    int hr, min, sec, day;

    Time(int s) {
        sec = s;
    }

    void calc() {

        hr = (int)Math.floor(sec / 3600);
        sec = sec % 3600;
        min = (int)Math.floor(sec / 60);
        sec = sec % 60;

        if(hr > 24) {
            day = (int)Math.floor(hr / 24);
            hr = hr % 24;
        }

        System.out.println("Day: " + day + "\nHour: " + hr + "\nMinute: " + min + "\nSecond: " + sec);

        if(hr < 1){
            System.out.println("Short Duration");
        } else if(hr >= 1 && day <= 1) {
            System.out.println("Midium Duration");
        } else {
            System.out.println("Long Duration");
        }
    }
}

class Driver {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the time in seconds: ");
        int sec = sc.nextInt();

        Time ob1 = new Time(sec);
        ob1.calc();

        sc.close();
    }
}
