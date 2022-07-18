import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class MainTest : StringSpec({

    "Addition of two numbers 5 and 8"{
        val obj1= Main()
        obj1.addition(5,8) shouldBe 13
    }
    "Addition of two numbers 12 and 15"{
        val obj1= Main()
        obj1.addition(12,15) shouldBe 27
    }
})
