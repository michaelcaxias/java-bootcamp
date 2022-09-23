package poo_java_1.aula_02.exemplo01;

public class AppBook {
    public static void main(String[] args) {
        Book myBook = new Book();

        myBook.title = "Clean Code";
        myBook.author = "Robert Martin";

        System.out.println("Livro: " + myBook.title);
    }
}
