import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class TableTest : StringSpec({
    "Returning values using this keyword"{
        var table =Table()
        table.adjustSize(50,150)  shouldBe "Table height is 50 amd Size is 150"
    }

})