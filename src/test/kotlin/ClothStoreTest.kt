import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class ClothStoreTest : StringSpec({
    "Store products "{
        with(ClothStore()){
            shoes=15
            shirts=25
            jackets=35

            printInventory() shouldBe "store has 15 shoes, 25 shirts and 35 jackets"
        }
    }
})