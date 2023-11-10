package org.example;

public class Book {
    private int id;
    private String name;
    private String genre;
    private String authorSurname;
    private String authorName;
    private int publishingYear;
    private String description;

    @Override
    public String toString() {
        return "\n id книги:         " + id +
               "\n Название книги:   " + name +
               "\n Жанр:             " + genre +
               "\n Автор:            " + authorSurname + ' ' + authorName +
               "\n Год издания:      " + publishingYear +
               "\n Краткое описание: " + description + '\n';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public void setAuthorSurname(String authorSurname) {
        this.authorSurname = authorSurname;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}