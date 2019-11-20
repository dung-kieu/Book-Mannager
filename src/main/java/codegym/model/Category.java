package codegym.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Category")
public class Category{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;

    @OneToMany(mappedBy = "category")
    private Set<Book> books;


    public Category(){
    }

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Book> getBooks(){
        return books;
    }
    public void setBooks(Set<Book> books)
    {
        this.books = books;
    }
}
