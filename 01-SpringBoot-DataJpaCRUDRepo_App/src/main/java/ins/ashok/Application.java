package ins.ashok;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ins.ashok.Enity.Book;
import ins.ashok.Repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		BookRepository repo = context.getBean(BookRepository.class);
//	       Book b=new Book(100,"java",2000.0);
//	       Book b2=new Book(101,"python",1500.0);
//	       Book b3=new Book(102,"hibernate",1000.0);
//	       Book b4=new Book(103,"springFramew",3000.0);
//	       Book b5=new Book(104,"springBoot",8000.0);
//	       Book b6=new Book(100,"mysl",25000.0);
//	
//	       repo.saveAll(Arrays.asList(b,b2,b3,b4,b5,b6));
//	       System.out.println("successfully inserted..");
//	       
//	    Iterable<Book>books  = repo.findAll();	    
//	    books.forEach(System.out::println);

//		List<Book> books = repo.findBybookPriceGreaterThan(1500.0);
//		books.forEach(System.out::println);
	       List<Book>books=repo.findBybookName("pytho");
//	       books.forEach(System.out::println);
	      if(books.isEmpty()) {
	    	  System.out.println("record is not there");
	      }else {
	    	books.forEach(System.out::println);
	      }
	}

}
