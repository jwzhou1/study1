package study1;

import java.util.Scanner;
public class Seqsearch {
	public static void main(String[] args) {
		String[] names = {"alex", "baba", "mama","yeye","nainai"};
		Scanner myscanner = new Scanner(System.in);
		System.out.println("请输入你要的名字");
		String name = myscanner.next();
		int index = -1;
		for (int i = 0; i < names.length; i++) {
			if (name.equals(names[i])) {
				System.out.println("恭喜你找到" + name);
				System.out.println("下标=" + i);
				index = i;
				break;
			} 
			}
		if (index == -1) {
			System.out.println("没有找到=" + name);
		}
	}
}

