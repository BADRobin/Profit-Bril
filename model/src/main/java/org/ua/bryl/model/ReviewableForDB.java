package org.ua.bryl.model;
import javax.persistence.*;


/**
 * Created by Sweet on 05.03.2017.
 */
@NamedQueries(
        @NamedQuery(name = "ReviewableForDB.getAll", query = "SELECT a  from  ReviewableForDB a")
)
@Entity
@Table(name = "ReviewableForDB")
public class ReviewableForDB {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String reviewableForDBName;


    @Column
    private Integer codeNo;



    public void setId(long id) {
        this.id = id;
    }

    public String getReviewableForDBName() {
        return reviewableForDBName;
    }

    public void setReviewableForDBName(String reviewableForDBName) {
        this.reviewableForDBName = reviewableForDBName;
    }

    public Integer getCodeNo() {
        return codeNo;
    }

    public void setCodeNo(Integer codeNo) {
        this.codeNo = codeNo;
    }
}



