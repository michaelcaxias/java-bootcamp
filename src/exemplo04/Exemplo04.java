package exemplo04;

public class Exemplo04 {
    public static void main(String[] args) {
        int vetor[] = new int[10];

        for (int index = 0; index < 10; index += 1) {
            vetor[index] = index;
            System.out.println(vetor[index]);
        }
    }
}
