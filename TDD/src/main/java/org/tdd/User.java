package org.tdd;

import lombok.Getter;

public class User {
    @Getter
    private String password;

    /**
     * password 초기화
     */
    public void initPassword(PasswordGenerator passwordGenerator /* 주입받음, 결합도 낮아짐 */){
//        RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator(); // 컨트롤 불가, 결합도 높음
        String randomPassword = passwordGenerator.generatePassword();

        /*
         * 비밀번호 최소 8자 이상 12자 이하
         */
        if(randomPassword.length() >= 8 && randomPassword.length() <= 12){
            this.password = randomPassword;
        }
    }
}
