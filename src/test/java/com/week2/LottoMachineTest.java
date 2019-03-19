package com.week2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LottoMachineTest {
    public static final int LOTTO_MAXNUMS = 45;

    LottoMachine lottoMachine;

    @Test
    public void 로또_번호_45개_생성() {
        lottoMachine = new LottoMachine(new LottoNumberSelector());
        List<Integer> numbers = lottoMachine.createNumbers();
        assertThat(numbers.size()).isEqualTo(LOTTO_MAXNUMS);
    }

    @Test
    public void 받은가격_만큼의_로또티켓_생성() {
        lottoMachine = new LottoMachine(new LottoNumberSelector());
        List<LottoTicket> lottoTickets = lottoMachine.buyLottoTicket(2000);
        assertThat(lottoTickets.size()).isEqualTo(2);
    }

    @Test
    public void 내가찍은_6개_번호가_있다() {
        //given
        lottoMachine = new LottoMachine(new TestLottoNumberSelector());

        //when
        List<LottoTicket> lottoTickets = lottoMachine.buyLottoTicket(1000);

        //then
        assertThat(lottoTickets.size()).isEqualTo(1);

        LottoTicket lottoTicket = lottoTickets.get(0);
        assertThat(lottoTicket.get(0)).isEqualTo(1); // 순서가 섞이지 않아 값 검증 가능
        assertThat(lottoTicket.get(2)).isEqualTo(3);
        assertThat(lottoTicket.get(5)).isEqualTo(6);
    }

    public static class TestLottoNumberSelector extends LottoNumberSelector{
        public TestLottoNumberSelector() {
            super();
        }

        @Override
        protected void shuffle(List<Integer> lottoNumbers) {
            // 테스트시에 섞지 않는다.
        }
    }

}
