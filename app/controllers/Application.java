package controllers;

import play.*;
import play.mvc.*;

import java.lang.*;
import java.util.*;

import models.*;

// @With(Secure.class)
public class Application extends Controller {

    public static void index() {
        String siapa = Security.connected();
        User x = User.find("username=?1", siapa).first();
        render(siapa, x);
    }

    public static void tampilkan() {
        List daftar = Peserta.findAll();
        render(daftar);
    }

    public static void tampilkanWorkshop() {
        List daftar = Workshop.findAll();
        render(daftar);
    }

    public static void baru() {
        List daftar = Workshop.findAll();
        render(daftar);
    }

    public static void baruWorkshop() {
        render();
    }

    public static void simpan(Peserta pesertaku) {
        pesertaku.save();
        tampilkan();
    }

    public static void simpanWorkshop(Workshop workshopku) {
        workshopku.save();
        tampilkanWorkshop();
    }

    public static void editWorkshop(Long id) {
        Workshop z = Workshop.find("id", id).first();
        render(z);
    }

    public static void hapusWorkshop(Long id) {
        Workshop z = Workshop.find("id", id).first();
        z.delete();
        tampilkanWorkshop();
    }

    public static void editPeserta(Long id) {
        Peserta z = Peserta.find("id", id).first();
        List daftar = Workshop.findAll();
        render(z, daftar);
    }

    public static void hapusPeserta(Long id) {
        Peserta z = Peserta.find("id", id).first();
        z.delete();
        tampilkan();
    }

    public static void register() {
        render();
    }

    public static void simpanUser(User userku) { 
        userku.save(); 
        redirectLogin(); 
    }

    public static void redirectLogin() {
        render();
    } 
}