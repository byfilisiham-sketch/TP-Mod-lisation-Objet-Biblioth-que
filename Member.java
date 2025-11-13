import java.time.LocalDate;

public class Member {
    private final String id;
    private final String fullName;
    private final Email email;
    private final LocalDate registrationDate;

    public Member(String id, String fullName, Email email, LocalDate registrationDate) {
        if (id == null || id.isBlank()) throw new IllegalArgumentException("ID obligatoire");
        if (fullName == null || fullName.isBlank()) throw new IllegalArgumentException("Nom obligatoire");
        if (email == null) throw new IllegalArgumentException("Email obligatoire");
        if (registrationDate == null) throw new IllegalArgumentException("Date obligatoire");

        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.registrationDate = registrationDate;
    }

    public String getId() { return id; }
    public String getFullName() { return fullName; }
    public Email getEmail() { return email; }
    public LocalDate getRegistrationDate() { return registrationDate; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Member)) return false;
        return id.equals(((Member) obj).id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return fullName + " (" + id + ")";
    }
}
