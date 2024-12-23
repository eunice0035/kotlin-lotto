package lotto.domain

data class Lotto(val numbers: List<Int>) {
    init {
        require(numbers.size == 6) {"Invalid input"}
        require(numbers.all { it in 1..45 }) { "Out of Range" }
    }

    fun getMatchedNumberCount(winningLotto: Lotto): Int {
        return numbers.count { it in winningLotto}
    }

    operator fun contains(number: Int): Boolean {
        return numbers.contains(number)
    }
}
