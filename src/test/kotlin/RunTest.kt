import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class RunTest: StringSpec({
    var run = Run()
    "Turning Laptop on"{
        run.turnOn() shouldBe "Laptop Turning on"
    }
    "Turning Laptop off"{
        run.turnOff() shouldBe "Laptop Turning off"
    }

})