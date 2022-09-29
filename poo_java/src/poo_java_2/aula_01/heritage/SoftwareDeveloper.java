package poo_java_2.aula_01.heritage;

public class SoftwareDeveloper extends Person {
    public SoftwareDeveloper(String name) {
        super(name);
    }

    public void develop() {
        System.out.printf("%s está desenvolvendo um programa de computador%n", this.name);
    }
}
