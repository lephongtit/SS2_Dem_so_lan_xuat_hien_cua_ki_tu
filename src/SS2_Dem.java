import java.util.Scanner;

public class SS2_Dem {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
            String chuoi;
            char kiTu='a';
            System.out.println("Nhập chuỗi: ");
            chuoi= sr.nextLine();
            int cout=0;
            for (int i=0;i<chuoi.length();i++){
                if (chuoi.charAt(i)==kiTu){
                    cout++;
                }
            }
            System.out.println("Số lần xuất hiện của kí tự "+kiTu+" trong chuỗi "+chuoi+"= "+cout );


        }
    }


