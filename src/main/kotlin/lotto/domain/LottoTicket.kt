package lotto.domain

class LottoTicket(private val tickets: List<Lotto>) {
    fun size(): Int = tickets.size
    fun getTickets(): List<Lotto> = tickets
}
