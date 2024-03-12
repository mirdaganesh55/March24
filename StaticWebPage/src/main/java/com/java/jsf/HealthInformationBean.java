package com.java.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class HealthInformationBean {
	
	private String welcomeMessage = "Welcome to Health Information Hub!";
    private String aboutUs = "Learn more about our mission and team.";

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public String getAboutUs() {
        return aboutUs;
    }
}
