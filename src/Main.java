import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhap vao chuoi ki tu can kiem tra:");
        StringBuilder str = new StringBuilder(sc.nextLine());
        //check empty
        str = checkEmpty(str);
        getResult(str);
    }

    private static StringBuilder checkEmpty(StringBuilder str) {
        do {
            if (str.isEmpty()) {
                System.out.println("Nhap lai chuoi ki tu can kiem tra:");
                str = new StringBuilder(sc.nextLine());
            }
        } while (str.isEmpty());
        return str;
    }

    private static void getResult(StringBuilder str) {
        String[] arr = {"aw", "aa", "dd", "ee", "oo", "ow", "w"};
        int count = 0;
        StringBuilder rs = new StringBuilder("(");
        for (String s : arr) {
            if (str.toString().contains(s)) {
                count++;
                rs.append(s);
                rs.append(",");
                str.delete(str.indexOf(s), str.indexOf(s) + s.length());
            }
        }
        rs.replace(rs.length() - 1, rs.length(), ")");
        System.out.println( count + " " + rs);
    }

}