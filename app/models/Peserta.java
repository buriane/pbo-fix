package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class Peserta extends Model {
    public String nama;
    public String no_telp;
    public String email;
    public String workshopString;

    @ManyToOne
    public Workshop workshop;

    public String toString() {
        return nama;
    }
}