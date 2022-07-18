import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class VarargTest: StringSpec({

    var varArg = Vararg()
    "Returning Objects with Var arg"{
        varArg.useVararg(3,"Ajay","Sunny","Sanket") shouldBe "hello Ajay, hello Ajay, hello Ajay, hello Sunny, hello Sunny, hello Sunny, hello Sanket, hello Sanket, hello Sanket, "

    }
})
