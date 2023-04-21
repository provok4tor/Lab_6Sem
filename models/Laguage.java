package models;

public class Language {
    private int languageID;
    private String name;

    public Author(int languageID, String name) {
        this.languageID = languageID;
        this.name = name;
    }

    public void setLanguageID(int languageID) {
        this.languageID = languageID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLanguageID() {
        return languageID;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Author{" +
                "languageID=" + languageID +
                ", name='" + name + '\'' +
                '}';
    }
}