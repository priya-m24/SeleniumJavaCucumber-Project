package TestData;

import java.io.IOException;
import java.util.ArrayList;

public class testSample {
	
	public static void main(String[] args) throws IOException {
		
	dataDrivennew pri =new dataDrivennew();
	
	ArrayList<String> data = pri.getData("AddProfile");
	
	System.out.println(data.get(0));
//	System.out.println(data.get(1));
//	System.out.println(data.get(2));
//	System.out.println(data.get(3));
	
	}

}
