package org.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @DisplayName("패스워드 초기화한다")
    @Test
    void passwordInitTest() {
        // given
        User user = new User();

        // when
        user.initPassword();

        // then
        assertThat(user.getPassword())
                .isNotNull();
    }
}