package study1;

import java.util.Scanner;
public class Seqsearch {
	public static void main(String[] args) {
		String[] names = {"alex", "baba", "mama","yeye","nainai"};
		Scanner myscanner = new Scanner(System.in);
		System.out.println("��������Ҫ������");
		String name = myscanner.next();
		int index = -1;
		for (int i = 0; i < names.length; i++) {
			if (name.equals(names[i])) {
				System.out.println("��ϲ���ҵ�" + name);
				System.out.println("�±�=" + i);
				index = i;
				break;
			} 
			}
		if (index == -1) {
			System.out.println("û���ҵ�=" + name);
		}
	}
}

