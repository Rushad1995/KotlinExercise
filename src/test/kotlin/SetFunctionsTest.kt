import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class SetFunctionsTest : StringSpec({
    var dress = SetFunctions()
    "Checking for the company dress code"{

        dress.companyAcceptedColor() shouldBe "[black]"

        dress.companyDress.add("red")
        dress.companyAcceptedColor() shouldBe "[black, red]"
    }

})
