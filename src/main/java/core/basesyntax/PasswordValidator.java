package core.basesyntax;

public class PasswordValidator {
    private static final int MIN_PASSWORD_LENGTH = 10;

    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Wrong passwords");
        }

        if (password.length() < MIN_PASSWORD_LENGTH) {
            throw new PasswordValidationException("Password length is less than " + MIN_PASSWORD_LENGTH);
        }
    }
}
