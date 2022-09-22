package poo_java_1.vetor_example;

public class Vetors {
    public static void main(String[] args) {
        int vetor[] = new int[10];

        for (int index = 0; index < 10; index += 1) {
            vetor[index] = index;
            System.out.println(vetor[index]);
        }
    }
}
