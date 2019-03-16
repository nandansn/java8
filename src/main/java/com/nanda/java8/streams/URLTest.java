package com.nanda.java8.streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.function.Consumer;

public class URLTest {

	public static void main(String[] args) throws IOException {
		URL url;
		Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("www-proxy.us.oracle.com", 80));
		
		
			// get URL content
			url = new URL("https://chromedriver.storage.googleapis.com/index.html");
			
			URLConnection conn = url.openConnection(proxy);

			// open the stream and put it into BufferedReader
			BufferedReader br = new BufferedReader(
                               new InputStreamReader(conn.getInputStream()));
			
			while ((br.readLine()) != null) {
				System.out.println(br.readLine());
			}

	
	}
}
