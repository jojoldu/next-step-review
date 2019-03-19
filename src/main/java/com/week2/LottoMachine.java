package com.week2;

import java.util.ArrayList;
import java.util.List;

public class LottoMachine {
    private static final int LOTTO_NO = 45;
    private final List<Integer> lottoNumbers;
    private final LottoNumberSelector lottoNumberSelector;

    public LottoMachine(LottoNumberSelector lottoNumberSelector) {
        this.lottoNumbers = createNumbers();
        this.lottoNumberSelector = lottoNumberSelector;
    }

    public List<LottoTicket> buyLottoTicket(int amount) {
        int salesQuantity = getSalesQuantity(amount);
        List<LottoTicket> lottoTickets = new ArrayList<>();

        for (int i = 0; i < salesQuantity; i++) {
            lottoTickets.add(new LottoTicket(lottoNumberSelector.selectLottoNumber(lottoNumbers)));
        }

        return lottoTickets;
    }

    private int getSalesQuantity(int amount) {
        return amount / 1000;
    }

    public List<Integer> createNumbers() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= LOTTO_NO; i++) {
            numbers.add(i);
        }
        return numbers;
    }
}