import java.util.Arrays;
public class TienIch {
    public static void menu(){
        System.out.println("         ~~~~~ Menu ~~~~~");
        System.out.println("1. Tính tổng các phần tử trong mảng");
        System.out.println("2. In ra phần tử lớn nhất, nhỏ nhất trong mảng");
        System.out.println("3. Sắp xếp lại mảng theo chiều tăng dần");
        System.out.println("4. In ra số nguyên tố lớn nhất trong mảng");
        System.out.print("Nhập lựa chọn:");
    }
    public static int tinhTong(int[] a){
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
        }
        return sum;
    }

    public static int inMax(int[] a){
        int max = a[0];
        for(int i = 1; i < a.length; i++){
            max = Math.max(max, a[i]);
        }
        return max;
    }

    public static int inMin(int[] a){
        int min = a[0];
        for(int i = 1; i < a.length; i++){
            min = Math.min(min, a[i]);
        }
        return min;
    }

    public static void sapXep(int[] a){
        Arrays.sort(a);
        for(int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    public static boolean checkPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0)
                return false;
        }
        return n > 1;
    }

    public static int primeMax(int[] a){
        int kq = -1;
        for(int i = 0; i < a.length; i++){
            if(checkPrime(a[i])){
                kq = Math.max(kq, a[i]);
            }
        }
        return kq;
    }
}
