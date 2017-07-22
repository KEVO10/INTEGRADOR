/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;
import org.omnifaces.cdi.ViewScoped;
import org.omnifaces.util.Faces;
import org.omnifaces.util.Messages;

import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by rmpestano on 04/02/17.
 */
@Named
@ViewScoped
public class LogonMB implements Serializable {

    private String email;

    private String password;

    private boolean remember;

    public String doLogon() {
        Faces.getFlash().setKeepMessages(true);
        Messages.addGlobalInfo("Logged in successfully!");
        return "usuarios/usuario.xhtml?faces-redirect=true";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isRemember() {
        return remember;
    }

    public void setRemember(boolean remember) {
        this.remember = remember;
    }
}
