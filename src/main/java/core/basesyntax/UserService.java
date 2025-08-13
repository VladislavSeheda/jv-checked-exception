package core.basesyntax;

public class UserService extends PasswordValidator {

    public void registerUser(User user, String password, String repeatPassword)
            throws PasswordValidationException {
        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Passwords do not match");
        }

        validate(password, repeatPassword);  // этот метод кидает checked exception, поэтому throws надо здесь
        saveUser(user);
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
