import java.util.Scanner;
public class Lab2task5 
{
  public static void main(String[] args) 
  {
    System.out.println("How many star ?");
    Scanner scan = new Scanner(System.in); // สร้างตัวแปรสำหรับรับค่าจากคีบอร์ด
    int count = scan.nextInt(); // รอรับข้อมูลมาเก็บในตัวแปร count
    for (int i = 0; i < count; i++){ // ควบคุมจำนวนบรรทัด
      for (int j = 0; j <= i; j++){ // ควบคุมจำนวน *
        System.out.print(" ");// เมื่อจบแต่ละบรรทัดขึ้นบรรทัดใหม่
      }
      System.out.println("*"); // วาดรูป *
    }
    System.out.println(); // เมื่อวาดเสร็จทำการขึ้นบรรทัดใหม่
  }
}
