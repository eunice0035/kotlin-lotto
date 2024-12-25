package lotto.domain

class LottoCalculator {
    fun calculateResults(tickets: LottoTicket, winningNumbers: Lotto): Map<Int, Int> {
        return tickets.getTickets()
            .groupingBy { it.getMatchedNumberCount(winningNumbers) }
            .eachCount()
    }

    fun calculateProfit(results: Map<Int, Int>): Double {
        val totalPrize = results.entries.sumOf { (match, count) ->
            when (match) {
                3 -> 5000 * count
                4 -> 50000 * count
                5 -> 1500000 * count
                6 -> 2000000000 * count
                else -> 0
            }
        }

        return totalPrize.toDouble()
    }
}
