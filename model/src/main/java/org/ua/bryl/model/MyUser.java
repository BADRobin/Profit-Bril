package org.ua.bryl.model;
import javax.persistence.*;


/**
 * Created by Sweet on 05.03.2017.
 */
@NamedQueries(
        @NamedQuery(name = "MyUser.getAll", query = "SELECT a  from  MyUser a")
)
@Entity
@Table(name = "MyUser")
public class MyUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String userName;


    @Column
    private Integer codeNo;



    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getCodeNo() {
        return codeNo;
    }

    public void setCodeNo(Integer codeNo) {
        this.codeNo = codeNo;
    }
}



