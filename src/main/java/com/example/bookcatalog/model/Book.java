package com.example.bookcatalog.model;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @ManyToOne(fetch = FetchType.LAZY) // Lazy fetch by default
    @JoinColumn(name = "author_id", referencedColumnName = "id", nullable = false)
    private Author author;

    @Column(name = "summary", length = 1000)
    private String summary;

    @Column(name = "publication_year")
    private int publicationYear;

    public Book() {
    }

    public Book(String title, Author author, String summary, int publicationYear) {
        this.title = title;
        this.author = author;
        this.summary = summary;
        this.publicationYear = publicationYear;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", summary='" + summary + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }
}
