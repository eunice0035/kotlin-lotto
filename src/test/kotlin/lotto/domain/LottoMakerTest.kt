package lotto.domain

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class LottoMakerTest {
    @Test
    fun `Lotto - size shoule be 6`() {
        val lottoMaker = LottoMaker()
        val lotto = lottoMaker.makeLotto()
        assertEquals(6, lotto.numbers.size)
    }

    @Test
    fun `Lotto - shoule be in range(1-45)`() {
        val lottoMaker = LottoMaker()
        val lotto = lottoMaker.makeLotto()
        assertTrue(lotto.numbers.all { it in 1..45 })
    }
}
