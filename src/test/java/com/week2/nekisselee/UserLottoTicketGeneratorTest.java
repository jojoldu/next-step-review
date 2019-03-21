package com.week2.nekisselee;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class UserLottoTicketGeneratorTest {

    @Test
    public void 사용자가_작성한_번호는_6개모두_중복되지않는다() {
        //given
        int expectedCount = 6;
        UserLottoTicketGenerator user = new UserLottoTicketGenerator();

        //when
        List<Integer> pickedTickets = user.generateTicket();

        //then
        List<Integer> distinctTickets = pickedTickets.stream()
                .distinct() // 중복 제거
                .collect(Collectors.toList());
        assertThat(distinctTickets.size()).isEqualTo(expectedCount);

    }
}
