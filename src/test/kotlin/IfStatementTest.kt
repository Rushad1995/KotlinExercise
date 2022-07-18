import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class IfStatementTest: StringSpec({
    var store = IfStatement()
    "Total payment using If Statement "{
        store.totalPay(true,true) shouldBe "Mans total pay at market : 100"
        store.totalPay(true,false) shouldBe "Mans total pay at market : 60"
        store.totalPay(false,false) shouldBe "Eggs are not available in market"
    }
})