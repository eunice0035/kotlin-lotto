package lotto.ui

class InputView {
    fun getMoney(): Int {
        println("구입금액을 입력해주세요")
        val money = readln()
        requireNotNull(money.toInt())
        return money.toInt()
    }

    fun getWinningNumbers(): List<Int> {
        println("지난 주 당첨 번호를 입력해 주세요.")
        return readln().split(",").map { it.trim().toInt() }.toList()
    }
}