package ������Ʈ2;

import java.util.Scanner;

public class �������ִ밪 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int a,b,c,d,e;
		System.out.print("���ڸ� �Է����ּ��� : ");
		a = in.nextInt();
		System.out.print("���ڸ� �Է����ּ��� : ");
		b = in.nextInt();
		System.out.print("���ڸ� �Է����ּ��� : ");
		c = in.nextInt();
		System.out.print("���ڸ� �Է����ּ��� : ");
		d = in.nextInt();
		System.out.print("���ڸ� �Է����ּ��� : ");
		e = in.nextInt();
		if(a>=b&&a>=c&&a>=d&&a>=e) {
			System.out.printf("�ִ밪��%d �Դϴ�.\n ",a);
			//�ִ� ���� ���ϴ� ���̱� ������ a�� �ִ�� ������ ��츦 ��� if���ǿ� ���, a�� �ִ밪�� �ǰ� ����
		}else if(b>=c&&b>=d&&b>=e&&b>=a) {
			System.out.printf("�ִ밪��%d �Դϴ�.\n ",b);
			}//a�� �ִ밪�� �ƴҶ�, b�� �ִ밪�� �Ǵ� ��� ����� ���� if���ǿ� ���, b�� �ִ밪�� �ǰ� ��.
			else if(c>=d&&c>=e&&c>=a&&c>=b) {
				System.out.printf("�ִ밪��%d �Դϴ�.\n ",c);
			}//a,b�� �ƴ� ��� c�� �Ǵ� if���ǿ� ���, c�� �ִ밪�� �ǰ� �� 
				else if(d>=e&&d>=a&&d>=b&&d>=c) {
					System.out.printf("�ִ밪��%d �Դϴ�.\n ",d);
				}//a,b,c�� �ƴҶ�, d���Ǵ� ��� ���ǿ� ���, d�� �ִ밡 �ǰ� ��.
				else if(e>=a&&e>=b&&e>=c&&e>=d) {
					System.out.printf("�ִ밪��%d �Դϴ�.\n ",e);
				}//a,b,c,d�� �ƴҶ�, e���Ǵ� ��� ���ǿ� ��� e�� �ǰ� ��.
		if(a<=b&&a<=c&&a<=d&&a<=e) {
			System.out.printf("�ּҰ���%d �Դϴ�.\n ",a);
		}//�ִ밪�� �ݴ�� ������ ��� �Ͽ�, �ּҰ��� ǥ����.
		else if(b<=c&&b<=d&&b<=e&&b<=a) {
			System.out.printf("�ּҰ���%d �Դϴ�.\n ",b);
			}
		else if(c<=d&&c<=e&&c<=a&&c<=b) {
				System.out.printf("�ּҰ���%d �Դϴ�.\n ",c);
				}else if(d<=e&&d<=a&&d<=b&&d<=c) {
					System.out.printf("�ּҰ���%d �Դϴ�.\n ",d);
				}else if(e<=a&&e<=b&&e<=c&&e<=d) {
					System.out.printf("�ּҰ���%d �Դϴ�.\n ",e);
				}
		in.close();			
		}
		
}
			


