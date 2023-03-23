package ms.learnings.inventoryservice.service

import jakarta.transaction.Transactional
import lombok.RequiredArgsConstructor
import ms.learnings.inventoryservice.repository.InventoryRepository
import org.springframework.stereotype.Service

@Service
@RequiredArgsConstructor

class InventoryService(val inventoryRepository: InventoryRepository) {
    @Transactional
    fun isSkuInStock(skuCode: String): Boolean {
        return inventoryRepository.findBySkuCode(skuCode).isPresent
    }
}