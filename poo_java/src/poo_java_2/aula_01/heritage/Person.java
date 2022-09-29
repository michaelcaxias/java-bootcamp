package poo_java_2.aula_01.heritage;

public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void walk() {
        System.out.printf("%s está andando...%n", this.name);
    }

    public void run() {
        System.out.printf("%s está correndo...%n", this.name);
    }
}
