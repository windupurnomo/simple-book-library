package id.etanee.training.simplebooklibrary.repository;

import id.etanee.training.simplebooklibrary.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {

}
