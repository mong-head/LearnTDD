package org.tdd;

public class CorrectFixedPasswordGenerator implements PasswordGenerator {

    @Override
    public String generatePassword(){
        return "abcdefgi";
    }
}
