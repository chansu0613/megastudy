package class_test._example;

import java.util.Scanner;

public class Timer {
    private int sec;
    private int min;
    private int hour;

    Timer() {
        this.sec = 0;
        this.min = 0;
        this.hour = 0;
    }
    void timeSec(){
        if(this.sec == 60){
            this.sec = 0;
            timeMin();
        }
        else this.sec++;
    }
    void timeMin(){
        if (this.min == 60){
            this.min = 0;
            timeHour();
        }
        else this.min++;
    }
    void timeHour(){
        if (this.hour == 59){
            System.out.println("max");
        }
        else this.hour++;
    }
    void showTime(){
        System.out.println(this.hour+"시간 "+this.min+"분 "+this.sec+"초");
    }
}

