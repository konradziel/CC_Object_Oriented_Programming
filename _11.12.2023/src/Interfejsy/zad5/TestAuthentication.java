package Interfejsy.zad5;

public class TestAuthentication {
    public static void main(String[] args) {
        Authentication userAuth = new UserAuthentication("user123", "pass123");
        System.out.println("Login użytkownika: " + userAuth.login("user123", "pass123")); // true
        userAuth.logout();
        System.out.println("Reset hasła użytkownika: " + userAuth.resetPassword("user123", "pass123", "newPass123")); // true

        Authentication adminAuth = new AdminAuthentication("admin", "adminPass");
        System.out.println("Login administratora: " + adminAuth.login("admin", "adminPass")); // true
        adminAuth.logout();
        System.out.println("Reset hasła administratora: " + adminAuth.resetPassword("admin", "adminPass", "newAdminPass")); // false
    }
}
