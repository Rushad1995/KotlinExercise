import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class FunctionTest : StringSpec({
    var func = Function()
    "Printing name and age "{
        var name="Alex"
        func.process("Ajay",22) shouldBe "Your Username is Ajay, and age is 22"
    }
})