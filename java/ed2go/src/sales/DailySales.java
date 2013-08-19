/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sales;

/**
 *
 * @author ross
 */
public class DailySales {
    private String dayOfWeek;
    private int dailySalesCount;
    private double dailyTotalSales;
    
    public DailySales(String dayName, int salesCount, double totalSales){
        dayOfWeek = dayName;
        dailySalesCount = salesCount;
        dailyTotalSales = totalSales;
    }
    
    public String toString(){
        return "Day: " + dayOfWeek + "\n\tSales for the day: " + dailySalesCount + "\n\tTotal sales for the day: $" + dailyTotalSales;
    }   
}
