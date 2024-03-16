
import java.util.Scanner;
public class Vidu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào họ và tên: ");
        String HovaTen = sc.nextLine();

        System.out.print("Nhập mã sinh viên: ");
        long maSinhVien = sc.nextLong();

        System.out.print("Nhập điểm thi: ");
        float DiemThi = sc.nextFloat();

        System.out.println("Họ và Tên: "+HovaTen);
        System.out.println("Mã sinh viên: "+maSinhVien);
        System.out.println("Điểm thi: "+DiemThi);
    }
}
