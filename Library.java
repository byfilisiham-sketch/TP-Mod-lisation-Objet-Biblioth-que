import java.util.*;

public class Library {
    private final List<Book> books = new ArrayList<>();
    private final List<Member> members = new ArrayList<>();
    private final List<Loan> loans = new ArrayList<>();

    public void addBook(Book book) { books.add(book); }
    public void registerMember(Member member) { members.add(member); }

    public void loanBook(Book book, Member member) {
        loans.add(new Loan(book, member, java.time.LocalDate.now(), java.time.LocalDate.now().plusDays(14)));
    }

    public List<Book> getBooks() { return Collections.unmodifiableList(books); }
    public List<Member> getMembers() { return Collections.unmodifiableList(members); }
    public List<Loan> getLoans() { return Collections.unmodifiableList(loans); }
}
