package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class Role extends Model {
    public String namaRole;

    public String toString() {
        return namaRole;
    }
}
