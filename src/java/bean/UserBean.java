/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author root
 */
@Named(value = "userBean")
@RequestScoped
public class UserBean {

    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserBean() {
    }

    public String login() {
        if (name.equals("admin") && password.equals("admin")) {
            FacesContext.getCurrentInstance().addMessage("myform:name", new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "Name cannot be admin", "Name cannot be admin"));
        }
        System.out.println("Name : " + name);
        System.out.println("Password : " + password);
        return null;
    }
}
