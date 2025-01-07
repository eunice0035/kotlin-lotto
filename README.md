# kotlin-lotto
## 기능 요구 사항
### 1. 입력
- [x] 구입 금액을 입력받는다.
- [x] 지난 주 당첨 번호를 입력받는다.

### 2. 로또 발급
- [x] 구입 금액에 따라 로또를 발급한다. (1장 = 1000원)
- [x] 각 로또는 1~45 사이의 중복되지 않는 6개의 숫자로 구성된다.

### 3. 당첨 검증
- [x] 각 로또의 숫자와 당첨 번호를 비교하여 일치하는 개수를 확인한다.
- [x] 일치 개수에 따라 당첨금을 계산한다.

### 4. 결과 출력
- [x] 당첨 내역을 출력한다. (3개, 4개, 5개, 6개 일치)
- [x] 수익률을 계산하여 출력한다.

### 5. 추가 수정사항
- [ ] enum class를 사용한다.
- [ ] 일급컬렉션을 적용한다.