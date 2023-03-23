package ms.learnings.inventoryservice.repository

import ms.learnings.inventoryservice.model.Inventory
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface InventoryRepository : JpaRepository<Inventory, Long> {


    fun findBySkuCode(skuCode: String): Optional<Inventory>

}