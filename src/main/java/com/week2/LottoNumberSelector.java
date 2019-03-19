package com.week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoNumberSelector {
    private static final int TICKET_SIZE = 6;

    public LottoNumberSelector() {}

    /**
     * 랜덤하면서 중복되지 않은 숫자 6개를 뽑는 로직을
     * 전체 카드를 섞은 뒤 6개를 뽑는 로직으로 구현한것은 아주 잘하셨습니다.
     *
     * 다만, 이 로직이 무엇을 하는지 이해못하는분들이 계실수 있습니다.
     * 그래서 메소드로 뽑아냅니다
     */

    public List<Integer> selectLottoNumber(List<Integer> totalLottoNumbers) {
        List<Integer> ticket = new ArrayList<>();

        for (int i = 0; i < TICKET_SIZE; i++) {
            ticket.add(totalLottoNumbers.get(i));
        }

        Collections.sort(totalLottoNumbers);

        return ticket;
    }

    protected void shuffle(List<Integer> lottoNumbers) {
        Collections.shuffle(lottoNumbers);
    }
}
