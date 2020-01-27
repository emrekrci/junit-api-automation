package tests;

import dto.BookDTO;

public class APITestCase {
	public static String BASE_URL = "http://localhost:8080";
	public static String API_ROOT = "/api/book/";
	public static BookDTO book = new BookDTO(1, "Ferenc Molnar", "Pal Sokağı Çocukları");
}
