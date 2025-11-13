public class Email {
    private final String email;

    public Email(String email) {
        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("Email invalide");
        }
        this.email = email;
    }

    private boolean isValidEmail(String email) {
        return email != null && email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }

    public String getEmail() { return email; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Email)) return false;
        return email.equals(((Email) obj).email);
    }

    @Override
    public int hashCode() {
        return email.hashCode();
    }

    @Override
    public String toString() {
        return email;
    }
}
