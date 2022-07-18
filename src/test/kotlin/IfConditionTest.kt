import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class IfConditionTest : StringSpec({
    var grade = IfCondition()
    "Get your grades  "{

        grade.getGrade(65) shouldBe "D Class"
    }
})