import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"aw", "aa", "dd", "ee", "oo", "ow", "w"};
        int count = 0;
        boolean checkEmpty = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi ki tu can kiem tra:");
        StringBuilder str = new StringBuilder(sc.nextLine());

        StringBuilder rs = new StringBuilder("(");
        //check empty
        if (str.isEmpty()) {
            checkEmpty = true;
        }
        while (checkEmpty) {
            System.out.println("Nhap lai chuoi ki tu can kiem tra:");
            str = new StringBuilder(sc.nextLine());
            if (!str.isEmpty()) {
                checkEmpty = false;
            }
        }

        //so sanh chuoi da nhap vao voi mang
        for (String s : arr) {
            if (str.toString().contains(s)) {
                str.delete(str.indexOf(s), s.length());
                count++;
                rs.append(s);
                rs.append(",");
            }
        }
        rs.replace(rs.length() - 1, rs.length(), ")");
        System.out.println(count + " " + rs);
    }
}