import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class BunnyTest : StringSpec({
    "Drawing a Bunny"{
        val l1="(\\(\\"
        val l2="(-.-)"
        val l3="o_(\")(\")"
        val bunny=l1+"\n"+l2+"\n"+l3
        Bunny().drawBunny() shouldBe bunny
    }

})