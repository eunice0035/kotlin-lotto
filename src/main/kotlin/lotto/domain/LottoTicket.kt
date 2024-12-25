package lotto.domain

class LottoTicket(private val tickets: List<Lotto>) {
    fun size(): Int = tickets.size

    fun getTickets(): List<Lotto> = tickets

    companion object {
        fun makeTicket(amount: Int): LottoTicket {
            val lottoMaker = LottoMaker.defaultMaker()
            val lottoCount = amount / 1000
            return LottoTicket(List(lottoCount) { lottoMaker.makeLotto() })
        }
    }
}
