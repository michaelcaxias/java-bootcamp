package poo_java_4.aula_01;

public class MainWrapper {
    public static void main(String[] args) {
        int n = 10;
        Integer integer = 15;

        n = integer;

        System.out.println(n);
        System.out.println(integer);

        int value = Integer.parseInt("123");
        String text = Integer.toString(123);

        Integer n1 = 200;
        Integer n2 = 200;

        System.out.println(n1 == n2);
        // o código acima dará false, pois é são objetos diferentes,
        // o correto é o abaixo

        System.out.println(n1.equals(n2));
    }
}
