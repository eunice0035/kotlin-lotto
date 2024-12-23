package lotto.domain

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LottoCalculatorTest {
    private val calculator = LottoCalculator()

    @Test
    fun testLottoCalculator() {
        val tickets = LottoTicket(
            listOf(
                Lotto(listOf(1, 2, 3, 4, 5, 6)),
                Lotto(listOf(1, 2, 3, 7, 8, 9)),
                Lotto(listOf(10, 11, 12, 13, 14, 15))
            )
        )
        val winningLotto = Lotto(listOf(1, 2, 3, 4, 5, 6))

        val results = calculator.calculateResults(tickets, winningLotto)
        assertEquals(1, results[6])
        assertEquals(1, results[3])
        assertEquals(1, results[0])
    }

    @Test
    fun testCalculateProfit() {
        val results = mapOf(
            6 to 1,
            5 to 2,
            4 to 1,
            3 to 2
        )

        val profit = calculator.calculateProfit(results)
        assertEquals(
            2000000000.0 * 1 + 1500000.0 * 2 + 50000.0 * 1 + 5000.0 * 2,
            profit
        )
    }
}
