package samples.model
import javax.persistence.*

/**
 * userテーブルのEntity.
 * @param id 主キー
 * @param name 名前
 * @param author 著者
 * @param isbn ISBN
 */
@Entity
@Table(name = "books")
data class Book(
        @Id
        @SequenceGenerator(name="id_gen",sequenceName = "id_gen")
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_gen")
            var id: Int? = 0,

        @Column(nullable = false)
        var name: String = "",

        @Column(nullable = false)
        var author: String = "",

        @Column(nullable = false)
        var isbn: String = ""
) {}


