package ac.uom.lk.library._API.repository;

import ac.uom.lk.library._API.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
