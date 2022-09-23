package poo_java_1.aula_02.exemplo02;

public class AppClock {
    public static void main(String[] args) {
        Clock pulseClock = new Clock();

        pulseClock.setHour(24);
        pulseClock.setMinute(40);
        pulseClock.setSecond(33);

        pulseClock.view();
    }
}
