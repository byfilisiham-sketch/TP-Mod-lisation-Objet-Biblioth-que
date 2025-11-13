public class Book {
    private final ISBN isbn;
    private final String title;
    private final String author;
    private final int publicationYear;

    public Book(ISBN isbn, String title, String author, int publicationYear) {
        if (isbn == null) throw new IllegalArgumentException("ISBN obligatoire");
        if (title == null || title.isBlank()) throw new IllegalArgumentException("Titre obligatoire");
        if (author == null || author.isBlank()) throw new IllegalArgumentException("Auteur obligatoire");
        if (publicationYear <= 0) throw new IllegalArgumentException("Année invalide");

        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public ISBN getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getPublicationYear() { return publicationYear; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;
        return isbn.equals(((Book) obj).isbn);
    }

    @Override
    public int hashCode() {
        return isbn.hashCode();
    }

    @Override
    public String toString() {
        return title + " (" + isbn + ")";
    }
}
