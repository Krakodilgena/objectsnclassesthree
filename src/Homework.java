import java.util.Objects;

public class Homework {
    public static void main(String[] args) {
        Author author = new Author("Дима", "Маслеников");
        Book book = new Book("Book 1 ", author, 2026);
        Book book2 = new Book("Book 1 ", author, 2026);
        book.equals(book2);
        //System.out.println(book.getTitle() + " " + book.getAuthor().getFirstName() + " "
        //        + book.getAuthor().getLastName() + " " + book.getYear());

        book.setYear(2015);
         book.toString();
         book.hashCode();

         author.toString();
         author.equals(book2);
         author.hashCode();

        //System.out.println(book.getTitle() + " " + book.getAuthor().getFirstName() + " "
        //        + book.getAuthor().getLastName() + " " + book.getYear());

        System.out.println(author.toString());
        System.out.println(author.equals(book2));
        System.out.println(author.hashCode());

        System.out.println(book.toString());
        System.out.println(book.equals(book2));
        System.out.println(book.hashCode());
    }

}