import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class MedalTest: StringSpec({
    var olympic=Olympic()
    "Checking age for Club Entry" {
        olympic.getmedol(1) shouldBe Medal.Gold
        //olympic.getmedol(2) shouldBe "Sorry you not allowed to enter"
    }
})