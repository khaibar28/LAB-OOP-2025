package login_app;

import java.util.ArrayList;
import java.util.Scanner;
import login_app.models.Profile;
import login_app.models.User;
import login_app.utils.StringUtils;

public class Main {
    private static ArrayList<User> listUser = new ArrayList<>();
    private static ArrayList<Profile> listUserProfile = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        while (true) {
            System.out.println("-------------------------");
            System.out.println("Aplikasi Login Sederhana");
            System.out.println("-------------------------");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("0. Exit");
            System.out.print("> ");

            int selectMenu = sc.nextInt();
            sc.nextLine(); // Mengosongkan newline
            switch (selectMenu) {
                case 1:
                    showLoginMenu();
                    break;
                case 2:
                    showRegisterMenu();
                    break;
                case 0:
                    System.out.println("Terima kasih! Sampai jumpa!");
                    return; // Kembali dari method main
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }
    }

    private static void showLoginMenu() {
        System.out.println("-------------------------");
        System.out.println("Login");

        String username = getInputNonEmpty("Masukkan Username: ", "Username tidak boleh kosong, silakan masukkan lagi.");
        int userIndex = findUserIndexByUsername(username);

        if (userIndex != -1) {
            String password = getInputNonEmpty("Password: ", "Password tidak boleh kosong, silakan masukkan lagi.");
            if (listUser.get(userIndex).getPassword().equals(password)) {
                System.out.println("Berhasil Login");
                showDetailUser(listUserProfile.get(userIndex));
            } else {
                System.out.println("Password Salah, silakan coba lagi.");
            }
        } else {
            System.out.println("Username tidak ditemukan.");
        }
    }

    private static int findUserIndexByUsername(String username) {
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getUsername().equals(username)) {
                return i; // Kembalikan index jika ditemukan
            }
        }
        return -1; // Kembalikan -1 jika tidak ditemukan
    }

    private static void showRegisterMenu() {
        System.out.println("-------------------------");
        System.out.println("REGISTER");

        String username = getUsername();
        String password = getPassword();

        User user = new User(username, password);
        Profile profile = getProfileData();

        listUser.add(user);
        listUserProfile.add(profile);
        
        System.out.println("-------------------------");
        System.out.println("Berhasil Membuat User Baru!!");
    }

    private static String getUsername() {
        while (true) {
            String username = getInputNonEmpty("Username: ", "Username tidak boleh kosong, silakan coba lagi.");
            if (isUsernameTaken(username)) {
                System.out.println("Username sudah digunakan, silakan coba nama lain.");
            } else {
                return username;
            }
        }
    }

    private static boolean isUsernameTaken(String username) {
        for (User user : listUser) {
            if (user.getUsername().equals(username)) {
                return true; // Username sudah ada
            }
        }
        return false; // Username belum ada
    }

    private static String getPassword() {
        while (true) {
            String password = getInputNonEmpty("Password (min 8 karakter): ", "Password tidak boleh kosong.");
            if (password.length() < 8) {
                System.out.println("Password terlalu pendek, harus minimal 8 karakter.");
            } else {
                return password;
            }
        }
    }

    private static Profile getProfileData() {
        String fullName = getInputNonEmpty("Nama Lengkap: ", "Nama lengkap tidak boleh kosong, silakan coba lagi.");
        int age = getValidAge();
        String hobby = getInputNonEmpty("Hobby: ", "Hobby tidak boleh kosong, silakan coba lagi.");

        Profile profile = new Profile(fullName, age, hobby);
        profile.setNickName(StringUtils.getNickName(fullName));
        return profile;
    }

    private static int getValidAge() {
        while (true) {
            System.out.print("Umur: ");
            try {
                int age = Integer.parseInt(sc.nextLine());
                if (age <= 0) {
                    System.out.println("Umur harus positif, silakan coba lagi.");
                } else {
                    return age; // Kembalikan umur yang valid
                }
            } catch (NumberFormatException e) {
                System.out.println("Input invalid. Silakan masukkan angka untuk umur.");
            }
        }
    }

    private static String getInputNonEmpty(String prompt, String errorMessage) {
        while (true) {
            System.out.print(prompt);
            String input = sc.nextLine();
            if (!input.isEmpty()) {
                return input; // Kembalikan input yang valid
            }
            System.out.println(errorMessage);
        }
    }

    private static void showDetailUser(Profile profile) {
        System.out.println("-------------------------");
        System.out.println("Detail User");
        System.out.println("Nama Lengkap: " + profile.getFullName());
        System.out.println("Nickname: " + profile.getNickName());
        System.out.println("Umur: " + profile.getAge());
        System.out.println("Hobby: " + profile.getHobby());
        System.out.println("-------------------------");
    }
} 