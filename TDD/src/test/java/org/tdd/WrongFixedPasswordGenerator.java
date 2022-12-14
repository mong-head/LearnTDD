package org.tdd;

public class WrongFixedPasswordGenerator implements PasswordGenerator {

    @Override
    public String generatePassword(){
        return "ab";
    }
}
