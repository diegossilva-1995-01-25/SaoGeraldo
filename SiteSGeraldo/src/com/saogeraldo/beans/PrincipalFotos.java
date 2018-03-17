package com.saogeraldo.beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean(name="principal")
public class PrincipalFotos {

	private List<String> images;
    
    @PostConstruct
    public void init() {
    	
    	FacesContext.getCurrentInstance().getExternalContext().getSession(true);
    	
        images = new ArrayList<String>();
        
        images.add("Oracao.jpg");
        images.add("Ensino.jpg");
        images.add("Familia.jpg");
        
    }
 
    public List<String> getImages() {
        return images;
    }
	
}
