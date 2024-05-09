package Sales_Analysis;


public class main {

public static void main (String[] args) {
	
	SalesAnalzer s=new SalesAnalzer();
	
	s.Addamount();
    s.AddDay();
    s.printDaysAndAmounts();
	s.CalculateTotalSales();
	s.FindBestSalesDay();
	s.FindWorstSalesDay();
	s.DisplaySalesReport();
	
	
}
}



