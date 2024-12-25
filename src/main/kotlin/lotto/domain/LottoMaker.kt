package lotto.domain

class LottoMaker(private val numberGenerator: () -> List<Int>) {
    fun makeLotto(): Lotto {
        return Lotto(numberGenerator().sorted())
    }

    companion object {
        private const val START_NUMBER = 1
        private const val END_NUMBER = 45
        private const val LOTTO_COUNT = 6

        fun defaultMaker(): LottoMaker {
            return LottoMaker({ (START_NUMBER..END_NUMBER).shuffled().take(LOTTO_COUNT).sorted() })
        }
    }
}
