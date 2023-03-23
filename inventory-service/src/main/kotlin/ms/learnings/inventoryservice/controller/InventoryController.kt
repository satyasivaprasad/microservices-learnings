package ms.learnings.inventoryservice.controller

import ms.learnings.inventoryservice.service.InventoryService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/inventory")
class InventoryController(val inventoryService: InventoryService) {
    @GetMapping("/{sku-code}")
    @ResponseStatus(HttpStatus.OK)
    fun isInStock(@PathVariable("sku-code") skuCode: String): Boolean {
        return inventoryService.isSkuInStock(skuCode)
    }
}