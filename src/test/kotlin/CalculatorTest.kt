import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class CalculatorTest: StringSpec({
    var calc = Calculator()
    "Testing Calculator operations"{
        calc.add(11.0) shouldBe 11.0
        calc.mul(5.0) shouldBe 55.0
        calc.div(10.0) shouldBe 5.5
        calc.sub(5.0) shouldBe 0.5
        calc.reset() shouldBe 0.0
    }

})