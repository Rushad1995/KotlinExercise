import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class JobTest: StringSpec({
    val engineer = Engineer()
    val doctor = Doctor()
    "Personalise Coffee "{
        engineer.name="engineer"
        doctor.name="doctor"

        engineer.salary=15000
        doctor.salary=25000
        engineer.work() shouldBe "engineer revenue 15000"
        engineer.study() shouldBe "engineer salary 20000"
        engineer.work() shouldBe "engineer revenue 35000"
        engineer.study() shouldBe "engineer salary 25000"

        doctor.work() shouldBe "doctor revenue 25000"
        doctor.study() shouldBe "doctor salary 30000"
        doctor.study() shouldBe "doctor salary 35000"
        doctor.work() shouldBe "doctor revenue 60000"

    }
})