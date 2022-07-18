import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class LocalFunctionsTest : StringSpec({
    var scope = LocalFunctions()
    "Local function"{
        scope.greetUser("Ajay") shouldBe "hi Ajay"
    }

})