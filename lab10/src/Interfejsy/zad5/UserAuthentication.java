package Interfejsy.zad5;

class UserAuthentication implements Authentication {
    private String username;
    private String password;

    public UserAuthentication(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    @Override
    public void logout() {
        System.out.println("Użytkownik wylogowany.");
    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        if (this.username.equals(username) && this.password.equals(oldPassword)) {
            this.password = newPassword;
            System.out.println("Hasło zmienione pomyślnie.");
            return true;
        } else {
            System.out.println("Błąd zmiany hasła. Nieprawidłowy użytkownik lub stare hasło.");
            return false;
        }
    }
}
