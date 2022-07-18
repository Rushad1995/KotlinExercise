import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class OverloadingTest : StringSpec({
    var overload= Overloading()
    "Method overloading operations"{
        overload.process1("coffee",10) shouldBe "coffee price with tax is 12.0"
//        var products = mapOf(Pair("Eggs",5),Pair("Bread",10),Pair("bacon",20))
//        overload.process1(products) shouldBe

    }

})