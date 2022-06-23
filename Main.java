package kitapSiralayici;

import java.util.Comparator;

import java.util.TreeSet;


public class Main {

	
	public static void main(String[] args) {
		
		
		Book book1=new Book("Cehennem","Dan Brown","2012.05",400);
		Book book2=new Book("Vadideki Zambak","Honor de Balzac","1920.03",250);
		Book book3=new Book("Toprak Ana","Amin Malouf","2003.03",120);
		Book book4=new Book("Su� ve Ceza","Dostoyevski","07.1890",460);
		Book book5=new Book("Sokratesin Savunmas�","Platon","1200.01",90);
		
		TreeSet<Book> booksetName=new TreeSet<>();
		booksetName.add(book1);
		booksetName.add(book2);
		booksetName.add(book3);
		booksetName.add(book4);
		booksetName.add(book5);
	
		for(Book book:booksetName) {
			System.out.printf("Book Name: %-27s Page: %4d\n", book.getBookName(), book.getPageNumber());
			
		}
		System.out.println("********");
		TreeSet<Book> pageNoBooks=new TreeSet<>(new Comparator<Book>() {

			
			@Override
			public int compare(Book o1, Book o2) {
				// TODO Auto-generated method stub
				return o1.pageNumber-o2.pageNumber;
			}

			
		}) ;
		pageNoBooks.add(book1);
		pageNoBooks.add(book2);
		pageNoBooks.add(book3);
		pageNoBooks.add(book4);
		pageNoBooks.add(book5);
		
		for(Book book: pageNoBooks) {
			System.out.printf("Book Name: %-27s Page: %4d\n", book.getBookName(), book.getPageNumber());
		}
		
		
		
	}

}

//Book isminde bir s�n�f tasarlay�n�z. Bu s�n�f Comparable interface'den kal�t�m al�p "compareTo" metodunu override ediniz.
//Bu metodun i�inde kitab� A'dan Z'ye isme g�re s�ralayan kodu yaz�n�z. Bu s�n�ftan 5 tane nesne olu�turun ve nesneleri Set tipinde bir yap�s�nda saklay�n�z.
//Sonra ikinci kez Set tipinden bir veri yap�s� kullan�n ve kitaplar� sayfa say�s�na g�re s�ralamas�n� sa�lay�n�z.
//
//
//
//Book s�n�f� kitap ismi, sayfa say�s�, yazar�n ismi, yay�n tarihi de�i�kenlerinden olu�maktad�r.