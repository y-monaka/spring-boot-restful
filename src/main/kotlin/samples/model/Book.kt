package samples.model
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

/**
 * userテーブルのEntity.
 * @param id 主キー
 * @param name 名前
 * @param author 著者
 * @param isbn ISBN
 */
@Entity
@Table(name = "books")
data class Book(@Id @GeneratedValue var id: Int? = 0,
                @Column(nullable = false) var name: String = "",
                @Column(nullable = false) var author: String = "",
                @Column(nullable = false) var isbn: String = "") {
}


