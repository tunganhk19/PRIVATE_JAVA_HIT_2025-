package BTVN;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choiceAuth, choiceUser;

        while (true) {
            AuthService.menuAuth();
            choiceAuth = sc.nextInt();
            sc.nextLine();

            switch (choiceAuth) {
                case 1:
                    System.out.print("Nhập tên đăng nhập: ");
                    String username = sc.nextLine();
                    System.out.print("Nhập mật khẩu: ");
                    String password = sc.nextLine();

                    if (AuthService.login(username, password)) {
                        System.out.println("Đăng nhập thành công!");
                        while (true) {
                            UserService.menuUser();
                            choiceUser = sc.nextInt();
                            sc.nextLine();
                            switch (choiceUser) {
                                case 1:
                                    System.out.print("Nhập ID người dùng: ");
                                    String userId = sc.nextLine();
                                    UserService.getUserById(userId);
                                    break;
                                case 2:
                                    UserService.getAllUser();
                                    break;
                                case 3:
                                    System.out.print("Nhập ID người dùng: ");
                                    String id = sc.nextLine();
                                    System.out.print("Nhập mật khẩu mới: ");
                                    String newPass = sc.nextLine();
                                    System.out.print("Xác nhận mật khẩu mới: ");
                                    String confirmPass = sc.nextLine();
                                    UserService.changePassword(id, newPass, confirmPass);
                                    break;
                                case 4:
                                    System.out.println("Đăng xuất thành công!");
                                    break;
                                default:
                                    System.out.println("Lựa chọn không hợp lệ!");
                            }
                            if (choiceUser == 4) break;
                        }
                    } else {
                        System.out.println("Sai tên đăng nhập hoặc mật khẩu!");
                    }
                    break;
                case 2:
                    System.out.print("Nhập tên đăng nhập mới: ");
                    String newUsername = sc.nextLine();
                    System.out.print("Nhập mật khẩu: ");
                    String newPassword = sc.nextLine();
                    System.out.print("Nhập email: ");
                    String newEmail = sc.nextLine();
                    System.out.print("Nhập số điện thoại: ");
                    String newPhone = sc.nextLine();
                    AuthService.register(newUsername, newPassword, newEmail, newPhone);
                    break;
                case 3:
                    System.out.println("Chương trình kết thúc. Tạm biệt!");
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}