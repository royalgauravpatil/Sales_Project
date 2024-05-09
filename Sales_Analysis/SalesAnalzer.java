package Sales_Analysis;

import java.util.Scanner;

public class SalesAnalzer {
	final int Sales = 7;

	int[] sales = new int[Sales];
	Scanner sc = new Scanner(System.in);

	String[] day = { "sun", "mon", "tue", "wed", "thu", "fri", "sat" };
	int sum = 0;
	String sum1;
	int totalSales;

	
	public void Addamount() {
		System.out.println("=========== Print Amount Start ==============");
		for (int i = 0; i < sales.length; i++) {
			System.out.println("enter a amount :" + i + " :-	");
			sales[i] = sc.nextInt();
		}

		System.out.println("=========== Print Amount End ==============");
	}

	public void AddDay() {
		System.out.println("=========== Print Day Start ==============");
		for (String st : day) {
			System.out.println("days :- " + st);
			sum1 += st;
		}
		System.out.println("=========== Print Day End ==============");

	}

	public void printDaysAndAmounts() {
		System.out.println("=========== Print Day&Amount Start ==============");
		for (int i = 0; i < day.length; i++) {
			System.out.println(day[i] + " :- " + sales[i]);
		}
		System.out.println("=========== Print Day&Amount End ==============");
	}

	public int CalculateTotalSales() {
		System.out.println("=========== Print TotalSale Start ==============");
		for (int i = 0; i < sales.length; i++) {
			System.out.println("sale per dayamount :" + i + " " + sales[i]);
			sum += sales[i];
		}
		System.out.println("=========== Print ToatlSale End ==============");
		System.out.println("Total Sale per week :- " + sum);
		return Sales;
	}

	public int FindBestSalesDay() {
		System.out.println("=========== Print Maximun Sales Start ==============");
		int BestSale = sales[0];
		int BestDaySale = 0;

		for (int i = 1; i < sales.length; i++) {
			if (sales[i] > BestSale) {
				BestSale = sales[i];
				BestDaySale = i;
			}

		}
		if (BestDaySale != 0) {

			System.out.println(
					"maximum sales Day : " + day[BestDaySale] + " , " + "  maximum amount in day :" + BestSale);
		} else {
			System.out.println("no sales in the day");
		}
		System.out.println("=========== Print Maximun Sales End ==============");
		return BestDaySale;

	}

	public int FindWorstSalesDay() {
		System.out.println("=========== Print Manimun Sales Start ==============");

		int WorstSale = sales[0];
		int worstDaySale = 0;

		for (int i = 1; i < sales.length; i++) {
			if (sales[i] < WorstSale) {
				WorstSale = sales[i];
				worstDaySale = i;
			}
		}
		if (worstDaySale != 0) {
			System.out.println(
					"manimum sales Day : " + day[worstDaySale] + " , " + "  minimum amount in day : " + WorstSale);
		} else {
			System.out.println("no sales in the day");
		}
		System.out.println("=========== Print Manimun Sales End ==============");
		return worstDaySale;

	}

	public void DisplaySalesReport() {
		sum = CalculateTotalSales();

		double averageSales = sum / (double) Sales;

		int bestDayIndex = FindBestSalesDay();
		int worstDayIndex = FindWorstSalesDay();

		System.out.println("=========== Sales Report Start ==============");
		System.out.println("Total Sales for the week: " + sum);
		System.out.println("Average daily sales: " + averageSales);
		System.out.println("Best sales day: " + day[bestDayIndex] + " with sales of " + sales[bestDayIndex]);
		System.out.println("Worst sales day: " + day[worstDayIndex] + " with sales of " + sales[worstDayIndex]);
		System.out.println("=========== Sales Report Start ==============");
	}

}
