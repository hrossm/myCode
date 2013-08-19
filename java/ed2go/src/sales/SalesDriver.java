/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sales;

/**
 *
 * @author ross
 */
public class SalesDriver {
    private DailySales[] week;
    private int day;
    private int salesCount;
    private float dailySales;
    private float averageSales;
    
    public SalesDriver(){
        week = new DailySales[7];
        day = 0;
        salesCount = 0;
        dailySales = 0.0f;
        averageSales = 0.0f;       
    }
    
    public void dummy(){
        
    }
    
    public void addSale(DailySales weekday){
        if (day < week.length){
            week[day] = weekday;
            day++;
        }
    }
    
    public String toString(){
        String weeklySales = "Weekly Sales\n\n";
        int i = 0;
        while (i < day){
            weeklySales = weeklySales + week[i] + "\n";
            i++;
        }
        return weeklySales;
    }
}
