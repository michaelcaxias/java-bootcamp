package poo_java_1.aula_01.matriz_example;

public class MatrizExample {
    public static void main(String[] args) {
        int matriz[][] = new int[10][2];

        for (int i = 0; i < 10; i += 1) {
            for (int j = 0; j < 2; j += 1) {
                matriz[i][j] = i + j;
            }
        }

        for (int i = 0; i < 10; i += 1) {
            for (int j = 0; j < 2; j += 1) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}
