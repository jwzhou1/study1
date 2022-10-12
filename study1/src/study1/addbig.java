package study1;
import java.util.Scanner;
public class addbig {

	public static void main(String[] args) {
		int[] arr = {10,12,45,90};
		Scanner myscanner = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÌí¼ÓÊı");
		int insert  = myscanner.nextInt();	
		int index = -1;
		for (int i = 0; i <arr.length;i++) {
			if ( insert <= arr[i]) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			index = arr.length;
		}
		int[] narr = new int[arr.length+1];
		for (int i = 0, j=0; i < narr.length; i++) {
			if (i != index) {
				narr[i] = arr[j];
				j++;
			} else {
				narr[i] = insert;
			}
		}
		arr = narr;
		for  (int i = 0; i <arr.length;i++) {
			System.out.println(arr[i] +"\t");
		}
	}
}
