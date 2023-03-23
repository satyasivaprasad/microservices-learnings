package ms.learnings.inventoryservice

import ms.learnings.inventoryservice.model.Inventory
import ms.learnings.inventoryservice.repository.InventoryRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean


@SpringBootApplication
class InventoryServiceApplication {
    @Bean
    fun loadData(inventoryRepository: InventoryRepository): CommandLineRunner {
        return CommandLineRunner { args: Array<String?>? ->
            val inventory = Inventory()
            inventory.skuCode = "iphone_13"
            inventory.quantity = 100

            val inventory1 = Inventory()
            inventory1.skuCode = "iphone_13_blue"
            inventory1.quantity = 100
            inventoryRepository.save(inventory)
            inventoryRepository.save(inventory1)
        }
    }
}

fun main(args: Array<String>) {
    runApplication<InventoryServiceApplication>(*args)
}