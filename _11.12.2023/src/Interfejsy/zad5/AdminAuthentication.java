package Interfejsy.zad5;

class AdminAuthentication implements Authentication {
    private String adminUsername;
    private String adminPassword;

    public AdminAuthentication(String adminUsername, String adminPassword) {
        this.adminUsername = adminUsername;
        this.adminPassword = adminPassword;
    }

    @Override
    public boolean login(String username, String password) {
        return this.adminUsername.equals(username) && this.adminPassword.equals(password);
    }

    @Override
    public void logout() {
        System.out.println("Administrator wylogowany.");
    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        if (this.adminUsername.equals(username) && this.adminPassword.equals(oldPassword)) {
            this.adminPassword = newPassword;
            System.out.println("Hasło zmienione pomyślnie.");
            return true;
        } else {
            System.out.println("Błąd zmiany hasła. Nieprawidłowy użytkownik lub stare hasło.");
            return false;
        }
    }
}
