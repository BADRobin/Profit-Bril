package org.ua.bryl.model;
import javax.persistence.*;


/**
 * Created by Sweet on 05.03.2017.
 */
@NamedQueries(
        @NamedQuery(name = "Reviewable.getAll", query = "SELECT a  from  Reviewable a")
)
@Entity
@Table(name = "Reviewable")
public class Reviewable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String reviewableName;


    @Column
    private Integer codeNo;



    public void setId(long id) {
        this.id = id;
    }

    public String getReviewableName() {
        return reviewableName;
    }

    public void setReviewableName(String reviewableName) {
        this.reviewableName = reviewableName;
    }

    public Integer getCodeNo() {
        return codeNo;
    }

    public void setCodeNo(Integer codeNo) {
        this.codeNo = codeNo;
    }
}



