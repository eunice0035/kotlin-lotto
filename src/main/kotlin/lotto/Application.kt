package lotto

import lotto.domain.Lotto
import lotto.domain.LottoCalculator
import lotto.domain.LottoMaker
import lotto.domain.LottoTicket
import lotto.ui.InputView
import lotto.ui.ResultView

fun main() {
    val inputView = InputView()
    val resultView = ResultView()

    val amount = inputView.getMoney()
    val lottoCount = amount / 1000
    val lottoMaker = LottoMaker()

    val tickets = List(lottoCount) { lottoMaker.makeLotto() }
    val lottoTicket = LottoTicket(tickets)
    resultView.printTickets(lottoTicket.getTickets())

    val winningLotto = Lotto(inputView.getWinningNumbers())

    val calculator = LottoCalculator()
    val results = calculator.calculateResults(lottoTicket, winningLotto)
    val profitRate = calculator.calculateProfit(results)

    resultView.printResults(results, profitRate)
}
