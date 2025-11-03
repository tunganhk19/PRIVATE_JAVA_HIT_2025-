package BTVN;

public class UserService {
    public static void menuUser(){
        System.out.println("--- Menu User ---");
        System.out.println("1. Get user by id");
        System.out.println("2. Get all user");
        System.out.println("3. Change password");
        System.out.println("4. Đăng xuất");
        System.out.print("Chọn chức năng: ");
    }
    public static void getUserById(String userId){
        for(int i = 0; i < AuthService.count; i++){
            if(AuthService.users[i].getId().equals(userId)){
                System.out.println(AuthService.users[i]);
                return;
            }
        }
        System.out.println("Không tìm thấy người dùng!");
    }
    public static void getAllUser() {
        if (AuthService.users == null || AuthService.count == 0) {
            System.out.println("Không có người dùng nào trong hệ thống.");
            return;
        }

        StringBuilder sb = new StringBuilder("----- USERS -----\n");
        for (int i = 0; i < AuthService.count; i++) {
            sb.append(String.format("%d. %s%n", i + 1, AuthService.users[i]));
        }
        sb.append("-------------");
        System.out.println(sb.toString());
    }
    public static void changePassword(String userId, String newPassword, String confirmNewPassword) {
        if (!newPassword.equals(confirmNewPassword)) {
            System.out.println("Mật khẩu xác nhận không khớp!");
            return;
        }
        for (int i = 0; i < AuthService.count; i++) {
            if (AuthService.users[i].getId().equals(userId)) {
                AuthService.users[i].setPassword(newPassword);
                System.out.println("Đổi mật khẩu thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy người dùng để đổi mật khẩu!");
    }
}