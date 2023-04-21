package models;

public class Book {
    private int bookID;
    private String name;
    private int genreID;
    private int authorID;
    private int languageID;

    public Book(int bookID, String name, int genreID, int authorID, int languageID) {
        this.bookID = bookID;
        this.name = name;
        this. genreID = genreID;
        this.authorID = authorID;
        this.languageID = languageID;
    }

    public int getBookID() {
        return bookID;
    }

    public int getGenreID() {
        return genreID;
    }

    public int getAuthorID() {
        return authorID;
    }

    public int getLanguageID() {
        return languageID;
    }

    public String getName() {
        return name;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }

    public void setGenreID(int genreID) {
        this.genreID = genreID;
    }

    public void setLanguageID(int languageID) {
        this.languageID = languageID;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookID +
                ", name='" + name + '\'' +
                ", genreID='" + genreID + '\'' +
                ", authorID='" + authorID + '\'' +
                ", languageID='" + languageID + '\'' +
                '}';
    }

}