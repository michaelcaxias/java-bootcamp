package poo_java_1.aula_02.heritage;

public class SoftwareDeveloper extends Person {
    public SoftwareDeveloper(String name) {
        super(name);
    }

    public void develop() {
        System.out.printf("%s está desenvolvendo um programa de computador%n", this.name);
    }
}
