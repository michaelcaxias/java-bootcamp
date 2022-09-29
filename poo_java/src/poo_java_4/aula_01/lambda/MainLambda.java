package poo_java_4.aula_01.lambda;

public class MainLambda {

    interface InterfaceString {
        String execute(String str);
    }

    public static void main(String[] args) {
        InterfaceString output = (s) -> s + " The end";

        print("Original", output);
    }

    public static void print(String text, InterfaceString output) {
        System.out.println(output.execute(text));
    }
}
