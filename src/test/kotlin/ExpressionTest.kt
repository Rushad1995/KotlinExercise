import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class ExpressionTest : StringSpec({
    var entry = Expressions()
    "Checking age for Club Entry" {
        entry.whoAreYou(22) shouldBe "Adult"
        entry.whoAreYou(17) shouldBe "Teen"
        entry.whoAreYou(12) shouldBe "Child"
    }
})