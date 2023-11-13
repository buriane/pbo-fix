package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class Workshop extends Model {
    public String namaWorkshop;
    public String pembicara;
    public Date tanggal;
    public String tempat;

    public String toString() {
        return this.namaWorkshop;
    }
}