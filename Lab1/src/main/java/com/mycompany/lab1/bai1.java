//Name : Phạm Minh Hoàng 
//Mssv : PS47440

package com.mycompany.lab1;

import java.util.Scanner;

public class bai1 {

   public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("hoten : ");
        String hoten = sc.nextLine();
        System.out.print("diemTB: "); 
        double diemTB = sc.nextDouble();
        System.out.printf("%s, %.2f diem\n", hoten , diemTB);
    }

}
