package practice;

import java.util.Scanner;

public class NumberX {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N  = sc.nextInt();
		int X = sc.nextInt();
		int[] array =null;
		array = new int[N];
		int[] array2 =null;
		array2 = new int[N];
		
		
		
		for(int i=0; i<N; i++) {
			int a=sc.nextInt();
			array[i]= a;
			if(a<X) {
				array2[i]= a;
			}
		}
		for(int i=0; i<N; i++) {
			int a=array2[i];
			if(a!=0) {
				System.out.print(a+" ");
			}
					
		}
		
		
		/*
		for(int j=0; j<N; j++) {
			
			b =array[j];
			array2 =new int[N];
			if(b<X) {
				
				int z=0;
				for(z=0; z<N; z++) {
					array2[z]=b;
					
				}
				System.out.println(array2[z]);
		}
		
		}
		*/
		/*
			if(a<X) {
				count++;
				for(int j=0; j<N; j++) {
					//array2[j]=a;
					
				}
			}*/
		}
		
		
	}


