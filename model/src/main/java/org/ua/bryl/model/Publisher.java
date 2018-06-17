package org.ua.bryl.model;
import javax.persistence.*;


/**
 * Created by Sweet on 05.03.2017.
 */
@NamedQueries(
        @NamedQuery(name = "Publisher.getAll", query = "SELECT a  from  Publisher a")
)
@Entity
@Table(name = "Publisher")
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String publisherName;


    @Column
    private Integer codeNo;



    public void setId(long id) {
        this.id = id;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public Integer getCodeNo() {
        return codeNo;
    }

    public void setCodeNo(Integer codeNo) {
        this.codeNo = codeNo;
    }
}



