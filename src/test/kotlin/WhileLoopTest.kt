import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class WhileLoopTest : StringSpec({

            var wLoop = WhileLoop()
    "Returning numebrs divisible by 7"{
            wLoop.getNumberDivisibleBy7(71) shouldBe "7 14 21 28 35 42 49 56 63 70 "

        }
    })
