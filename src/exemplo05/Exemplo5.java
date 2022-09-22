package exemplo05;

public class Exemplo5 {
    public static void main(String[] args) {
        int matriz[][] = new int[5][5];

        for (int i = 0; i < 5; i += 1) {
            for (int j = 0; j < 5; j += 1) {
                matriz[i][j] = i + j;
            }
        }

        for (int i = 0; i < 5; i += 1) {
            for (int j = 0; j < 5; j += 1) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}
