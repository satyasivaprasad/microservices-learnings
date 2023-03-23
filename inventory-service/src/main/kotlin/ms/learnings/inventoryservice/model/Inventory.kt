package ms.learnings.inventoryservice.model

import jakarta.persistence.*
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter

@Entity(name = "inventory")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
data class Inventory (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    val id: Long? = null,
    var skuCode: String? = null,
    var quantity: Int = 0
)
