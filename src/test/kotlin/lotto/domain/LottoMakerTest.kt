package lotto.domain

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class LottoMakerTest {
    @Test
    fun `Lotto - size should be 6`() {
        val fixedNumbers = listOf(1, 2, 3, 4, 5, 6)
        val lottoMaker = LottoMaker { fixedNumbers }
        val lotto = lottoMaker.makeLotto()

        lotto.numbers.size shouldBe 6
    }

    @Test
    fun `Lotto - should be same with list`() {
        val fixedNumbers = listOf(1, 2, 3, 4, 5, 6)
        val lottoMaker = LottoMaker { fixedNumbers }
        val lotto = lottoMaker.makeLotto()

        lotto.numbers shouldBe fixedNumbers
    }

    @Test
    fun `Lotto - should be in range(1-45)`() {
        val lottoMaker = LottoMaker.defaultMaker()
        val lotto = lottoMaker.makeLotto()
        lotto.numbers.all { it in 1..45 } shouldBe true
    }
}
