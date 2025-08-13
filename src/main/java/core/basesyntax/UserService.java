package core.basesyntax;

public class UserService extends PasswordValidator {

    public void registerUser(User user, String password, String repeatPassword) throws PasswordValidationException {
        if (!password.equals(repeatPassword)) {
            throw new PasswordValidationException("Passwords do not match");
        }

        // Використовуємо метод з PasswordValidator (припускаю, що він є)
        validate(password, repeatPassword`);

        saveUser(user);
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
