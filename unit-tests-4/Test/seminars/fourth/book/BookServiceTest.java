package seminars.fourth.book;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class BookServiceTest {

    private BookRepository mockBookRepository;
    private BookService bookService;

    @BeforeEach
    public void setup(){
        mockBookRepository = mock(BookRepository.class);
        bookService = new BookService(mockBookRepository);
    }

    @Test
    public  void findByIdTest(){
        Book book = new Book("1", "Book1", "Author1");
        when(mockBookRepository.findById("1")).thenReturn(book);

        Book res = bookService.findBookById("1");
        verify(mockBookRepository).findById("1");

        assertEquals(book, res);
    }

    @Test
    void findAllTest(){
        List<Book> books = Arrays.asList(
                new Book("1", "Book1", "Author1"),
                new Book("2", "Book2", "Author2")
        );
        when(mockBookRepository.findAll()).thenReturn(books);

        List<Book> res = bookService.findAllBooks();
        verify(mockBookRepository).findAll();

        assertEquals(books, res);
    }
}