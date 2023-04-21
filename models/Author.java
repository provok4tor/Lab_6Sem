package models;

public class Author {
    private int authorID;
    private String name;
    private Strnig surname;

    public Author(int authorID, String name, String surname) {
        this.authorID = authorID;
        this.name = name;
        this.surname = surname;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(Strnig surname) {
        this.surname = surname;
    }

    public int getAuthorID() {
        return authorID;
    }

    public String getName() {
        return name;
    }

    public Strnig getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorID=" + authorID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}