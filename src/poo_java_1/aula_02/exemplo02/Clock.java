package poo_java_1.aula_02.exemplo02;

public class Clock {
    private int hour, minute, second;

    public void setHour(int newHour) {
        hour = newHour;
    }

    public void view() {
        System.out.println(hour + ":" + minute + ":" + second);
    }
}
