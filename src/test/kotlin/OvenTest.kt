import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class OvenTest : StringSpec({
    var oven1:Oven=Bosch()
    var oven2:Oven=Roaster()
    "Abstract class implementation"{
        oven1.cooking() shouldBe "Bosch oven is cooking with 50 speed and 210 temp"
        oven2.cooking() shouldBe "Roaster oven is cooking with 50 speed and 100 temp"

    }

})