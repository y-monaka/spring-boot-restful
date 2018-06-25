package samples.repository

import samples.model.Book
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.io.Serializable
import org.springframework.data.jpa.repository.support.SimpleJpaRepository
/**
 * usersテーブルのRepository.
 */
@Repository
interface BookRepository : JpaRepository<Book, Long> {
    fun findById(id:Int):Book
}