package org.ua.bryl.model;
import javax.persistence.*;

/**
 * Created by Sweet on 18.06.2017.
 */
@NamedQueries(
        @NamedQuery(name = "Isbn.getAll", query = "SELECT a  from  Isbn a")
)
@Entity
@Table(name = "Isbn")
public class Isbn {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String isbnName;


    @Column
    private Integer codeNo;



    public void setId(long id) {
        this.id = id;
    }

    public String getIsbnName() {
        return isbnName;
    }

    public void setIsbnName(String isbnName) {
        this.isbnName = isbnName;
    }

    public Integer getCodeNo() {
        return codeNo;
    }

    public void setCodeNo(Integer codeNo) {
        this.codeNo = codeNo;
    }
}
