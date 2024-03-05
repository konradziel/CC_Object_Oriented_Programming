public class TestTime {

    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time();

        time1.hours = 14;
        time1.minutes = 32;

        time2.hours = 11;
        time2.minutes = 47;

        Time sumTime = time1.addTime(time2);

        sumTime.printTime();
    }
}

class Time {
    int hours;
    int minutes;

    public Time addTime(Time otherTime) {
        Time newTime = new Time();
        newTime.hours = this.hours + otherTime.hours;
        newTime.minutes = this.minutes + otherTime.minutes;

        if(newTime.minutes > 59) {
            newTime.hours += (newTime.minutes/60);
            newTime.minutes %= 60;
        }

        if(newTime.hours > 23) {
            newTime.hours %= 24;
        }

        return newTime;
    }

    public void printTime() {
        System.out.println("Time: " + hours + ":" + minutes);
    }
}
