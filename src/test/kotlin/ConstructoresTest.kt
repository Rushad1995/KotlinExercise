import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class ConstructoresTest : StringSpec({
    val store1 = Constructores()
    val store2 = Constructores("Sanket")
    val store3 = Constructores("Sunny",100)
    val stores = listOf<Constructores>(store1,store2,store3)
    "Constructor invoking" {
        for (store in stores) {
            if (store.isAffortable())
                store.isAffortable() shouldBe true
            else
                store.isAffortable() shouldBe false
        }
    }
})
