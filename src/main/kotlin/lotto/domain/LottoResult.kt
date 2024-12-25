package lotto.domain

data class LottoResult(private val result: Map<Int, Int>) {
    fun getResults(): Map<Int, Int> {
        return result
    }

    fun getMatchCount(match: Int): Int {
        return result.getOrDefault(match, 0)
    }
}
