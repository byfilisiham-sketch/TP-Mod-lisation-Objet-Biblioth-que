public class ISBN {
    private final String isbn;

    public ISBN(String isbn) {
        if (!isValidISBN(isbn)) {
            throw new IllegalArgumentException("ISBN invalide");
        }
        this.isbn = isbn;
    }

    private boolean isValidISBN(String isbn) {

        return isbn != null && isbn.matches("\\d{3}-\\d{10}");
    }

    public String getIsbn() { return isbn; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof ISBN)) return false;
        return isbn.equals(((ISBN) obj).isbn);
    }

    @Override
    public int hashCode() {
        return isbn.hashCode();
    }

    @Override
    public String toString() {
        return isbn;
    }
}
