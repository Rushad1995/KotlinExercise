import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class PolymorphismTest : StringSpec({
    var poly = Polymorphism()
    "Testing Calculator operations"{
        poly.selectChannel(7) shouldBe "Start the 7 channel"
        poly.selectChannel(5,"English") shouldBe "Start the 5 channel with English subtitle"
        poly.selectChannel(3,10) shouldBe "Start the 3 channel at 10 time"
    }

})