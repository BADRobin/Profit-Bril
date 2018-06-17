package org.ua.bryl.model;
import javax.persistence.*;


/**
 * Created by Sweet on 05.03.2017.
 */
@NamedQueries(
        @NamedQuery(name = "Periodicals.getAll", query = "SELECT a  from  Periodicals a")
)
@Entity
@Table(name = "Periodicals")
public class Periodicals {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String periodicalsName;


    @Column
    private String codeNo;



    public void setId(long id) {
        this.id = id;
    }

    public String getPeriodicalsName() {
        return periodicalsName;
    }

    public void setPeriodicalsName(String periodicalsName) {
        this.periodicalsName = periodicalsName;
    }

    public String getCodeNo() {
        return codeNo;
    }

    public void setCodeNo(String codeNo) {
        this.codeNo = codeNo;
    }
}



