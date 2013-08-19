/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sales;

/**
 *
 * @author ross
 */
public class Sales {
    public static void main(String[] args){
        SalesDriver s = new SalesDriver();
        for (int i=0; i < 7; i++){
            s.addSale(new DailySales("Monday", 1, 1.0));
        }
        System.out.println(s.toString());
    }
}
