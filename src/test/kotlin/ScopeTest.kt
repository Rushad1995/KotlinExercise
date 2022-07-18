import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class ScopeTest : StringSpec({
    var scope = Scope()
    "Scope test"{
       scope.buyMoreParakeets(5) shouldBe "You now have 5 parakeets"
    }

})