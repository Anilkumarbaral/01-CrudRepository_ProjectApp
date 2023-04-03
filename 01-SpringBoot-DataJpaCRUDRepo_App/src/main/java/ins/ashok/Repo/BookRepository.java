package ins.ashok.Repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ins.ashok.Enity.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {
	
	
	   public List<Book>findBybookPriceGreaterThan(Double price);
	   public List<Book>findBybookPriceGreaterThanEqual(Double bookprice);
	   public List<Book>findBybookName(String name);
}
