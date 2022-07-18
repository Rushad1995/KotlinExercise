import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class CoffeeShopTest : StringSpec({
    var coffee = CoffeeShop()
    "Personalise Coffee "{
        var name="Alex"
        coffee.sellCoffee(name) shouldBe "Your coffee is ready $name..."
    }
})