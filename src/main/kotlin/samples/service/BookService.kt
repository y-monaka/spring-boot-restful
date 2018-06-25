package samples.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import samples.model.Book
import samples.repository.BookRepository

/**
 * DBからのデータ取得と加工を行う.
 */
@Service
open class BookService @Autowired constructor(private val bookRepository: BookRepository) {

    /**
     * 全ユーザリストの取得
     * @return ユーザリスト
     */
    fun findAllBook(): MutableList<Book> = bookRepository.findAll()
    fun findById(id:Int): Book{
        var book: Book = bookRepository.findById(id)
        return book
    }

    fun exists(id: Long) : Boolean{
        return bookRepository.exists(id)
    }

    fun save(book:Book){
        bookRepository.save(book)
    }

    fun delete(book:Book){
        bookRepository.delete(book)
    }
}