package lotto.ui

import lotto.domain.Lotto

class ResultView {
    fun printTickets(tickets: List<Lotto>) {
        println("${tickets.size}개를 구매했습니다.")
        tickets.forEach { println(it.numbers) }
    }

    fun printResults(
        results: Map<Int, Int>,
        profit: Double,
    ) {
        println("당첨 통계")
        println("---------")
        results.forEach { (matchCount, count) ->
            println("$matchCount 개 일치 - $count 개")
        }
        println("총 수익률은 $profit 입니다.")
    }
}
