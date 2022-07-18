import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class BreakContinueTest : StringSpec({
    var entry = BreakContinue()
    "Checking age for Club Entry" {
        entry.checkEntryToClub(22) shouldBe "Welcome to our club"
        entry.checkEntryToClub(17) shouldBe "Sorry you not allowed to enter"
    }
})