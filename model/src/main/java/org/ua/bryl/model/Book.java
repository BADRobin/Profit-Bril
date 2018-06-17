package org.ua.bryl.model;
import javax.persistence.*;


/**
 * Created by Sweet on 05.03.2017.
 */
@NamedQueries(
        @NamedQuery(name = "Book.getAll", query = "SELECT a  from  Book a")
)
@Entity
@Table(name = "Book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String bookName;


    @Column
    private Integer codeNo;



    public void setId(long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getCodeNo() {
        return codeNo;
    }

    public void setCodeNo(Integer codeNo) {
        this.codeNo = codeNo;
    }


}