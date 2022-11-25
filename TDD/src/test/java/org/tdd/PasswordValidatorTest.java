package org.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

/**
 * 요구사항
 * • 비밀번호는 최소 8자 이상 12자 이하여야 한다.
 * • 비밀번호가 8자 미만 또는 12자 초과인 경우 IllegalArgumentException 예외를 발생시킨다.
 * • 경계조건에 대해 테스트 코드를 작성해야 한다.
 */
public class PasswordValidatorTest {

    @DisplayName("비밀번호 최소 8자 이상, 12자 이하면 에러 발생하지 않는다.")
    @Test
    void validatePasswordTest() {
        assertThatCode(() -> PasswordValidator.validate("qodbwlsdlek"))
                .doesNotThrowAnyException();
    }

    @DisplayName("비밀번호 8자 미만, 12자 초과인 경우 IllegalArgumentException 예외 발생된다.")
    @ParameterizedTest
    @ValueSource(strings = {"1234567","1234567891011"}) // 경계조건 테스트 코드 (7자, 13자)
    void validatePasswordException(String password) {
        assertThatCode(() -> PasswordValidator.validate(password))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(PasswordValidator.WRONG_PASSWORD_EXCEPTION_MESSAGE);
    }
}
