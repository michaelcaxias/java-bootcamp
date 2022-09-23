package poo_java_1.aula_02.exemplo01;

public class AppBook {
    public static void main(String[] args) {
        Book myBook = new Book();

        myBook.title = "Clean Code";
        myBook.author = "Robert Martin";
        myBook.pages = 320;

        myBook.open();

        System.out.println("Livro: " + myBook.title);
    }
}
