class Time{
    int hour;
    int minute;

    public Time(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    }

    // public void addition(Time temp){
    //     this.hour = this.hour + temp.hour;
    //     this.minute = this.minute + temp.minute;
    // }

    public Time addition(Time temp){
        Time ans = new Time(0,0);
        ans.hour = this.hour + temp.hour;
        ans.minute = this.minute + temp.minute;  
        return ans; 
    }

    public void printTime(){
        System.out.println("Hour = "+this.hour+" and Minute = "+this.minute);
    }
}

public class TimeDemo{
    public static void main(String[] args){
        Time t1 = new Time(5,30);
        Time t2 = new Time(3,20);

        Time a = t1.addition(t2);
        a.printTime();
    }
}