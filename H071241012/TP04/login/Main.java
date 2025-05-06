package login;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import login.models.Profile;
import login.models.User;
import login.utils.StringUtils;

public class Main {
    private static ArrayList<User> listUser = new ArrayList<>();
    private static ArrayList<Profile> listUserProfile = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        System.out.println("-------------------------");
        System.out.println("Aplikasi Login Sederhana");
        System.out.println("-------------------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.print("> ");

        try {
            int selectMenu = sc.nextInt();
            sc.nextLine(); // flush newline
            switch (selectMenu) {
                case 1 -> showLoginMenu(); //soal ada tambahan break
                case 2 -> showRegisterMenu();
                default -> {
                    System.out.println("Sistem tidak valid, silakan masukkan 1 atau 2");
                    runApp();
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Masukkan angka!");
            sc.nextLine();
            runApp();
        }
    }

    private static void showLoginMenu() {
        System.out.println("-------------------------");
        System.out.println("Login");
        String username = readNonEmptyString("Masukkan Username");

        int userIndex = -1;
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getUsername().equals(username)) {
                userIndex = i;
                break;
            }
        }

        if (userIndex != -1) {
            String password = readNonEmptyString("Password");
            boolean isPasswordMatch = listUser.get(userIndex).getPassword().equals(password);

            if (isPasswordMatch) {
                System.out.println("Berhasil Login");
                //TODO
                //panggil methodshowDetailUser dan kirimkan data profil user yang login
                showDetailUser(listUserProfile.get(userIndex));
                System.exit(0);
            }
        } else {
            System.out.println("Username tidak ditemukan!");
            runApp();
        }
    }

    private static void showRegisterMenu() {
        System.out.println("-------------------------");
        System.out.println("REGISTER");

        /*
         * TODO
         * Buatlah atau Instance objek User baru, dan tambahkan
         * username dan password yang diinput sebelumnya secara langsung
         * saat instance User
         */
        String username;
        do {
            username = readNonEmptyString("Username");
            if (isUsernameExist(username)) {
                System.out.println("Username sudah digunakan. Silakan pilih yang lain.");
            }
        } while (isUsernameExist(username));

                /*
         * TODO
         * Buatlah atau Instance objek Profile baru
         */
        String password;
        do {
            password = readNonEmptyString("Password (minimal 8 karakter)");
            if (password.isEmpty()){
                System.out.println("Password tidak boleh kosong.");
            }
            if (password.length() < 8) {
                System.out.println("Password harus minimal 8 karakter!");
            }
        } while (password.length() < 8);

        User user = new User(username, password);
        Profile profile = new Profile();

        String fullName = readNonEmptyString("Nama Lengkap");

        int age = 0;
        while (true) {
            System.out.println("Umur");
            System.out.print("> ");
            try {
                age = sc.nextInt();
                sc.nextLine(); // flush newline
                if (age <= 0) {
                    System.out.println("Umur harus lebih dari 0!");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Masukkan umur berupa angka!");
                sc.nextLine(); // flush invalid input
            }
        }

        String hobby = readNonEmptyString("Hobby");

        /*
         * TODO
         * Buatlah atau Instance objek Profile baru
         */
        profile.setFullName(fullName);
        profile.setAge(age);
        profile.setHobby(hobby);
        profile.setNickName(StringUtils.nickNameGenerator(fullName));

        // Menambahkan user yang dibuat ke list user
        listUser.add(user);
        // Menambahkan profile user yang dibuat ke list profile
        listUserProfile.add(profile);

        System.out.println("-------------------------");
        System.out.println("Berhasil Membuat User Baru!!");
        runApp();
    }

    private static void showDetailUser(Profile profile) {
        System.out.println("=========================");
        System.out.println("SELAMAT DATANG !!");
        System.out.println("=========================");
        System.out.println("Nama Lengkap : " + profile.getFullName());
        System.out.println("Nama Panggilan : " + profile.getNickName());
        System.out.println("Umur : " + profile.getAge());
        System.out.println("Hobby : " + profile.getHobby());
    }

    // ========== Method Tambahan ==========

    private static String readNonEmptyString(String prompt) {
        String input;
        do {
            System.out.println(prompt);
            System.out.print("> ");
            input = sc.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Input tidak boleh kosong!");
            }
        } while (input.isEmpty());
        return input;
    }

    private static boolean isUsernameExist(String username) {
        for (User u : listUser) {
            if (u.getUsername().equals(username)) return true;
        }
        return false;
    }
}

