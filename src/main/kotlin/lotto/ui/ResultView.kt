package lotto.ui

import lotto.domain.Lotto
import lotto.domain.LottoResult

class ResultView {
    fun printTickets(tickets: List<Lotto>) {
        println("${tickets.size}개를 구매했습니다.")
        tickets.forEach { println(it.numbers) }
    }

    fun printResults(
        results: LottoResult,
        profit: Double,
    ) {
        println("당첨 통계")
        println("---------")
        results.getResults().forEach { (matchCount, count) ->
            println("$matchCount 개 일치 - $count 개")
        }
        println("총 수익률은 $profit 입니다.")
    }
}
