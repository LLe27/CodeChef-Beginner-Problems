import java.io.*;
import java.net.URL;
import org.json.*;

public class CostProgram {
		// Download the URL as a text file
	private static String readUrl(String urlString) throws Exception {
	    BufferedReader reader = null;
	    try {
	        URL url = new URL(urlString);
	        reader = new BufferedReader(new InputStreamReader(url.openStream()));
	        StringBuffer buffer = new StringBuffer();
	        int read;
	        char[] chars = new char[1024];
	        while ((read = reader.read(chars)) != -1)
	            buffer.append(chars, 0, read);

	        return buffer.toString();
	    } finally {
	        if (reader != null)
	            reader.close();
	    }
	}

	public static void main(String[] args) {
		JSONObject jsonURL = null;
		double totalCost=0;
		try {		// Parse the JSON text
			for (int k=0; k<=6; k++){		// 6 total pages (0-6) of results based on trail and error on checking the amount of pages
				jsonURL = new JSONObject(readUrl("http://shopicruit.myshopify.com/products.json?page="+k));		// Read JSON from URL
				JSONArray productsArray = jsonURL.getJSONArray("products");		// Create an array of products information
				for (int i=0; i<productsArray.length();i++){		// Iterate through each product
					JSONObject productsObj = productsArray.getJSONObject(i);		// JSON Objects containing information about the products
					JSONArray variantsArray = productsObj.getJSONArray("variants");		// Extract variant information of each product
					for (int j=0; j<variantsArray.length(); j++){		// Iterate through each variant of each product
						JSONObject variantsObj = variantsArray.getJSONObject(j);		// JSON Object containing information about the variants of the product
						double price = variantsObj.getDouble("price");			// Extract the price of the product
						//int quantity = jsonVarients.getInt("inventory_quantity");		// Extract quantity if it were presented in JSON
						totalCost+=price;		// Calculate the total cost (with quantity totalCost+=(price*quantity))
						//System.out.println(price);		// Print the cost of each item
					}
				}
			}
			System.out.printf("Total cost to buy all whacky products in the store: $%.2f",totalCost);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
