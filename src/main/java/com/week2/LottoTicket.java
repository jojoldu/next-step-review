package com.week2;

import java.util.List;

public class LottoTicket {

    private List<Integer> buyLottoNumbers;

    public LottoTicket(List<Integer> buyLottoNumbers) {
        this.buyLottoNumbers = buyLottoNumbers;
    }

    public List<Integer> getBuyLottoNumbers() {
        return buyLottoNumbers;
    }

    public Integer get(int index) {
        return buyLottoNumbers.get(index);
    }

    @Override
    public String toString() {
        return " " +
                buyLottoNumbers +
                " ";
    }
}
