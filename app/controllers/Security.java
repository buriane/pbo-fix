package controllers;

import models.User;

public class Security extends controllers.Secure.Security {
    static boolean authenticate(String username, String password) {
        boolean boleh = false;
        User x = User.find("username=?1 and password=?2", username, password).first();
        if (x!=null) {
            boleh = true;
            session.put("username", username);
        }
        return boleh;
    }
}