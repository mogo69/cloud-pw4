package com.google.training.helloworld;

public class HelloClass {
    public String message = "Hello World";

    public HelloClass () {
    }

    public HelloClass (String name) {
        this.message = "Hello " + name + "!";
    }
    public HelloClass (String name, String period) {
        this.message = "Good "+period+" " + name + "!!!!!!";
        System.out.println("2");
    }

    public String getMessage() {
        return message;
    }

	public void getPrediction() {
		this.message+="/n"+"You are amazing!"+"/n"+"Today is GREAT DAY for you!";
	}
    
    

}
