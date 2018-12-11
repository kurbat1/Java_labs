package fablic;

import liter.Book;

public class BookFactory implements Factory<Book> {
    @Override
    public Book createInstance() {
        return new Book();
    }
}
