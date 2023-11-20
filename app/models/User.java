package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class User extends Model {
    public String nama;
    public String username;
    public String no_telp;
    public String email;
    public String password;

    @ManyToOne
    public Role role;

    @ManyToOne
    public Workshop workshop;

    public String toString() {
        return username;
    }
}
