import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ISBN isbn = new ISBN("123-1234876535");
        Email email = new Email("test@example.com");

        Book book = new Book(isbn, "Java Basics", "Siham", 2025);
        Member member = new Member("M001", "Siham BYFILI", email, LocalDate.now());

        Library library = new Library();
        library.addBook(book);
        library.registerMember(member);
        library.loanBook(book, member);

        System.out.println("Livres :");
        library.getBooks().forEach(System.out::println);

        System.out.println("\nMembres :");
        library.getMembers().forEach(System.out::println);

        System.out.println("\nEmprunts :");
        library.getLoans().forEach(System.out::println);
    }
}
