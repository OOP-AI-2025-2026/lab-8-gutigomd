package ua.opnu.task2;

public class BookData implements Comparable<BookData> {
    private String title;
    private String author;
    private int reviews;
    private double total;

    public String getTitle() {
        return title;
    }

    public BookData(String title, String author, int reviews, double total) {
        this.title = title;
        this.author = author;
        this.reviews = reviews;
        this.total = total;
    }

    public double getRating() {
        if (reviews == 0) return 0.0;
        return total / reviews;
    }

    @Override
    public int compareTo(BookData other) {
        double myRating = this.getRating();
        double otherRating = other.getRating();

        if (myRating > otherRating) {
            return -1;
        } else if (myRating < otherRating) {
            return 1;
        } else {
            return this.title.compareTo(other.title);
        }
    }

    @Override
    public String toString() {
        return String.format("Book{title='%s', rating=%.2f}", title, getRating());
    }
}
