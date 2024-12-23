package lotto.domain

class LottoMaker {
    fun makeLotto(): Lotto {
        return Lotto((START_NUMBER..END_NUMBER).shuffled().take(LOTTO_COUNT).sorted())
    }

    companion object {
        const val START_NUMBER = 1
        const val END_NUMBER = 45
        const val LOTTO_COUNT = 6
    }
}
