package com.springbootdemo.springbootdemo;

import java.util.List;

import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;
import org.ektorp.http.HttpClient;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbConnector;
import org.ektorp.impl.StdCouchDbInstance;

public class TestDemo {
	
	public static void main(String args[]) throws Exception{
		System.out.println("Hello World!!");
		HttpClient httpClient = new StdHttpClient.Builder()  
		.url("https://couchdb-dfce62.smileupps.com/_utils/database.html?").username("admin").password("2208214cd400")  
		.build();  
		CouchDbInstance dbInstance = new StdCouchDbInstance(httpClient);  
		//--------------- Creating database----------------------------//  
		CouchDbConnector db = new StdCouchDbConnector("firstdbtest", dbInstance);  
		List<String> docs = db.getAllDocIds();
		for(String s:docs){
			System.out.println(s);
		}
		  
	}

}
