import java.util.Scanner;

public class Anagram {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;

		int t = sc.nextInt();
		String s1,s2;
		int[] arr,arr1;

		for( i=0;i<t;i++) {
			int c = 0;
			s1 = sc.next();
			s2 = sc.next();
			if(s1.length() == s2.length()) {
				arr = new int[26];
				arr1 = new int[26];
				for(int j=0;j<s1.length();j++) {
					arr[s1.charAt(j) - 'a']++;
					arr1[s2.charAt(j) - 'a']++;
				}
				for(int j=0;j<arr.length;j++) {
					if(arr[j] != arr1[j]) {
						c = 1;
						break;
					}
				}
 			} else {
 				c = 1;
			}
			if(c == 1) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}
	}
}