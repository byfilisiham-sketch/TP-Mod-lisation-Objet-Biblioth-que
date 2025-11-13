import java.time.LocalDate;

public class Loan {
    private final Book book;
    private final Member member;
    private final LocalDate loanDate;
    private final LocalDate dueDate;
    private LoanStatus status;

    public Loan(Book book, Member member, LocalDate loanDate, LocalDate dueDate) {
        if (book == null || member == null) throw new IllegalArgumentException("Livre et membre obligatoires");
        if (loanDate == null || dueDate == null || dueDate.isBefore(loanDate))
            throw new IllegalArgumentException("Dates invalides");

        this.book = book;
        this.member = member;
        this.loanDate = loanDate;
        this.dueDate = dueDate;
        this.status = LoanStatus.ONGOING;
    }

    public Book getBook() { return book; }
    public Member getMember() { return member; }
    public LoanStatus getStatus() { return status; }
    public LocalDate getDueDate() { return dueDate; }

    public void returnBook() { status = LoanStatus.RETURNED; }

    public boolean isLate() {
        return status == LoanStatus.ONGOING && LocalDate.now().isAfter(dueDate);
    }

    @Override
    public String toString() {
        return book + " emprunté par " + member + " (statut: " + status + ")";
    }
}
