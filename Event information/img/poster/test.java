package sec03.exam01;

/* for���� �̿��Ͽ� *�� �𷡽ð� ����� ����ϴ� ���α׷�
 * �۷ι� ����Ʈ�����а� 2017315024 ������
 * 2020/07/22*/
import java.util.*;

public class test {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("�ﰢ���� ���̸� ������ �ּ���. : ");
      int hight = sc.nextInt();
      // �� �ﰢ�� ���
      for (int a = hight; a > 0; a--) {
         for (int b = hight; b > a; b--) {
            System.out.print(" ");
         }
         for (int c = 2 * a - 1; c > 0; c--) {
            System.out.print("*");
         }
         System.out.println();
      }

      // ���ﰢ�� ���
      for (int i = 1; i <= hight; i++) {
         for (int j = 1; j <= hight - i; j++) {
            System.out.print(" ");
         }
         // Ȧ�� ��� ���� �̿�
         for (int k = 1; k <= i * 2 - 1; k++) {
            System.out.print("*");
         }
         System.out.println();
      }
   }

} 