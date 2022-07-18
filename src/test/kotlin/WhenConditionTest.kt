import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class WhenConditionTest : StringSpec({

    var whenObj = WhenCondition()
    "Selecting options with When Condition-1"{
        whenObj.searchFrom("Ajay") shouldBe "Hello Ajay"

    }
    "Selecting options with When Condition-2"{
    whenObj.searchFrom("Vijay") shouldBe "Hey Vijay"

}
    "Selecting options with When Condition-3"{
        whenObj.searchFrom("Dhoot") shouldBe "Hi Dhoot"

    }
})