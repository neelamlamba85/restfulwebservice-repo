package webservice.webservice.user;

import java.util.Date;

public class user {
    private Integer id;
    private String name;
    private Date bdate;

    public user(Integer id, String name, Date date) {
        this.id = id;
        this.name = name;
        this.bdate = date;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + bdate +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Date date) {
        this.bdate = date;
    }



    public Integer getId() {
        return id;
    }

    public Date getDate() {
        return bdate;
    }



    public String getName() {
        return name;
    }

}
