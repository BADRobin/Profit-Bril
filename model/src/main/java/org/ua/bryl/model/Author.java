package org.ua.bryl.model;
import javax.persistence.*;


/**
 * Created by Sweet on 05.03.2017.
 */
@NamedQueries(
        @NamedQuery(name = "Author.getAll", query = "SELECT a  from  Author a")
)
@Entity
@Table(name = "Author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String firstName;


    @Column
    private Integer codeNo;



    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getCodeNo() {
        return codeNo;
    }

    public void setCodeNo(Integer codeNo) {
        this.codeNo = codeNo;
    }
}



