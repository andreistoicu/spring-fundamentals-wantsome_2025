package recap.spring_moderate_exercises.exercise2;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<BookDTO> getAllBooks() {
        List<Book> booksList =  bookRepository.findAll();
        return mapEntityToDTO(booksList);
    }

    private static List<BookDTO> mapEntityToDTO(List<Book> books) {
        return books.stream()
                .map(book -> new BookDTO(book.getTitle(), book.getAuthor())).toList();
    }
}
