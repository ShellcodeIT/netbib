package br.com.shellcode.netbib.mb;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("helloBean")
//@SessionScoped
@RequestScoped
public class HelloBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
