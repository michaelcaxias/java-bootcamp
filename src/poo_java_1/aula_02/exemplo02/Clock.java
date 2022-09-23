package poo_java_1.aula_02.exemplo02;

public class Clock {
    private int hour, minute, second;

    public void setHour(int newHour) {

        if (newHour >= 24) {
            hour = 23;
        } else {
            hour = Math.max(newHour, 0);
        }
    }

    public void setMinute(int newMinute) {

        if (newMinute >= 60) {
            minute = 59;
        } else {
            minute = Math.max(newMinute, 0);
        }
    }

    public void setSecond(int newSecond) {

        if (newSecond >= 60) {
            second = 59;
        } else {
            second = Math.max(newSecond, 0);
        }
    }

    public void view() {
        System.out.println(hour + ":" + minute + ":" + second);
    }
}
