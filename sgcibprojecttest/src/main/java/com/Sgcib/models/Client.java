package com.Sgcib.models;

public class Client {

private String name;
private double account;

public Client(String name, double account){
	this.name = name;
	this.account = account;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getAccount() {
	return account;
}

public void setAccount(double account) {
	this.account = account;
}
}
