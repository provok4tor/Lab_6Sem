package models;

public class Genre {
    private int genreID;
    private String name;

    public Author(int genreID, String name) {
        this.genreID = genreID;
        this.name = name;
    }

    public void setGenreID(int genreID) {
        this.genreID = genreID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGenreID() {
        return genreID;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "genreID=" + genreID +
                ", name='" + name + '\'' +
                '}';
    }
}