package com.medipol.conditionals;

public class IfElseIf {

	public static void main(String[] args) {
		int a = -1;
		System.out.println("Denetimden önceki kod kesimi");
		if (a > 0) {
			System.out.println("a, 0'dan büyüktür.");
		} else if (a < 0) {
			System.out.println("a, 0'dan küçüktür.");
		} else if( a==0){
			System.out.println("a'nın değeri 0'dır.");
		}else
			System.out.println("Bilinmeyen bir sayi tipinde a degeri girilmis");
		
		System.out.println("Denetimden sonraki kod kesimi");
	}

}
