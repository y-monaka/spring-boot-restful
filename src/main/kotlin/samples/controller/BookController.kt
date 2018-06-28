package samples.controller
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import org.springframework.web.servlet.ModelAndView
import samples.model.Book
import samples.service.BookService


@Controller
class BookController @Autowired constructor(private val bookService: BookService) {

    @RequestMapping("/books")
    fun index(): ModelAndView = ModelAndView("/book/index").apply { addObject("books", bookService.findAllBook()) }

    @RequestMapping("/api/books")
    fun api_index(): ResponseEntity<MutableList<Book>> {
        return ResponseEntity.ok(bookService.findAllBook())
    }

    @RequestMapping("/api/books/{id}")
    fun api_show(@PathVariable("id") id : Int): ResponseEntity<Book> {
        return ResponseEntity.ok(bookService.findById(id))
    }

    @RequestMapping("/api/books", method = arrayOf(RequestMethod.POST))
    fun api_create(@RequestBody book: Book): ResponseEntity<Unit> {
        return ResponseEntity.ok(bookService.save(Book( book.id, book.name,book.author,book.isbn)))
    }

    @RequestMapping("/api/books/{id}",method = arrayOf(RequestMethod.DELETE))
    fun api_delete(@PathVariable("id") id : Int):ResponseEntity<Book>{
        var book:Book = bookService.findById(id)
        if(book != null){
            bookService.delete(book)
        }
        return ResponseEntity.ok(book)
    }
}