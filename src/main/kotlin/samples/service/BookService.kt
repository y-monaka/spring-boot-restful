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
     * 全書籍情報の取得
     * @param なし
     * @return 書籍リスト
     */
    fun findAllBook(): MutableList<Book> = bookRepository.findAll()

    /**
     * 指定された書籍情報の取得
     * @param ID
     * @return 書籍リスト
     */
    fun findById(id:Int): Book{
        var book: Book = bookRepository.findById(id)
        return book
    }

    /**
     * 指定された書籍情報の保存
     * @param Bookクラス
     * @return なし
     */
    fun save(book:Book){
        bookRepository.save(book)
    }

    /**
     * 指定された書籍情報の削除
     * @param ID
     * @return なし
     */
    fun delete(book:Book){
        bookRepository.delete(book)
    }
}