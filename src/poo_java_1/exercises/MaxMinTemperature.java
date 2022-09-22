package poo_java_1.exercises;

public class MaxMinTemperature {
    public static void main(String[] args) {
        String[] cities = {"Londres", "Madrid", "New York", "Buenos Aires", "Asuncion", "Sao Paulo", "Lima", "Santiago", "Lisboa", "Tokio" };
        int[][] temperatures = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};

        int min = temperatures[0][0];
        int max = 0;

        String minCity = cities[0];
        String maxCity = cities[0];

        for (int linha = 0; linha < 10; linha++) {
            String city = cities[linha];
            System.out.println(city);

            for (int column = 0; column < 2; column++) {
                int temperature = temperatures[linha][column];

                if (temperature < min) {
                    min = temperature;
                    minCity = city;
                }

                if (max < temperature) {
                    max = temperature;
                    maxCity = city;
                }

                System.out.print(temperatures[linha][column] + " ");
            }
            System.out.println();
        }

        System.out.println(String.format("A temperatura mais baixa foi %s da cidade %s", min, minCity));
        System.out.println(String.format("A temperatura mais alta foi %s da cidade %s", max, maxCity));
    }
}
