package poo_java_3.aula_01;

public class AppFigure {

    public static void main(String[] args) {
        Figure circle = new Circle();

        GeneratePDF.generate(circle);

        System.out.println(circle.getName());
    }
}
