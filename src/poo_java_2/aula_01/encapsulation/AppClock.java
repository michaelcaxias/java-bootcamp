package poo_java_2.aula_01.encapsulation;

public class AppClock {
    public static void main(String[] args) {
        Clock pulseClock = new Clock(24, 30, 22);

        pulseClock.view();
    }
}
