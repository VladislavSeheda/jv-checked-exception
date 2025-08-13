package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        char[] password1 = password.toCharArray();
        char[] repeatPassword2 = repeatPassword.toCharArray();

        if (password.equals(repeatPassword)) {
            if (password.length() < 10 || repeatPassword.length() < 10) {
                throw new PasswordValidationException("Wrong passwords");
            }
        } else {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
