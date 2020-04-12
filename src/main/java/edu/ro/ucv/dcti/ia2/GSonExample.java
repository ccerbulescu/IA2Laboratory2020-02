package edu.ro.ucv.dcti.ia2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GSonExample {
	void test() {
		// initialize the gson library. Standard code
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();

		A a1 = new A(4);// instantiate A in a1
		String json = gson.toJson(a1);// converts a1 to JSON format
		System.out.println("a1, x=4 to JSON: " + json);

		json = "{\"x\":22}"; // set a new json string
		A a2 = gson.fromJson(json, A.class); // converts the JSON string to an instance of class A

		System.out.println("a2, x=22: " + a2.getX());

	}
}
