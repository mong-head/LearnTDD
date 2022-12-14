package org.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @DisplayName("패스워드 올바르게 초기화한다")
    @Test
    void passwordInitTest() {
        // given
        User user = new User();

        // when
//        user.initPassword(new CorrectFixedPasswordGenerator());
        user.initPassword(() -> "12345678");

        // then
        assertThat(user.getPassword())
                .isNotNull();
    }

    @DisplayName("패스워드가 요구사항에 부합하지 않아 초기화가 되지 않는다.")
    @Test
    void passwordWrongInitTest() {
        // given
        User user = new User();

        // when
//        user.initPassword(new WrongFixedPasswordGenerator());
        user.initPassword(() -> "12");

        // then
        assertThat(user.getPassword())
                .isNull();
    }
}