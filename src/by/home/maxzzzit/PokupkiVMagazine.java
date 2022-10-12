package by.home.maxzzzit;
import java.util.Scanner;
//Покупатель в магазине расплачивается за 30 покупок, и надо определить количество покупок,
//стоимость каждой из которых превышает 500 рублей, а также определить общую сумму 
//всех сделанных им покупок!

public class PokupkiVMagazine {
	public static void main(String []args) {
		Scanner scn = new Scanner (System.in);
		int stoimost,sum=0,kolvo=0;
		System.out.println("Введите стоимость каждой из 30 покупок: ");
			for (int i=1; i<=30; i++) {
				stoimost=scn.nextInt();
				sum+=stoimost;
				if (stoimost>500)
					kolvo++;
				System.out.println(i+" покупка "+stoimost+" р. "+"дорогих покупок "+kolvo+" штук. Общая стоимость покупок = "+sum);
			}
	}
}
