package practiceProblem1.day11_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class StockManagement{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter How Many different stocks you hold");
        int numberOfStocks=sc.nextInt();
        sc.nextLine();
        StockPortfolio portfolio=new StockPortfolio();
        for(int i=0;i<numberOfStocks;i++){
            System.out.println("enter stock name");
            String stockName=sc.nextLine();
            System.out.println("enter no of stocks you hold");
            int noOfStocks=sc.nextInt();
            System.out.println("enter that stock value");
            double stockValue=sc.nextDouble();
            sc.nextLine();
            portfolio.addStock(stockName, noOfStocks, stockValue);
            System.out.println("Stock Added Successfully");
        }
        portfolio.valueOfEachStock();
        portfolio.calculatePortfolio();
    }
}
class StockPortfolio{
    List<Stock> list=new ArrayList<>();
    public void addStock(String stockName,int numberofStocks,double stockValue){
        list.add(new Stock(stockName, numberofStocks, stockValue));
    }
    public void valueOfEachStock(){
        for(Stock stock:list){
            System.out.println("The Stock Of "+stock.getStockName()+" is "+stock.getNumberofStocks()*stock.getStockValue());
        }
    }
    public void calculatePortfolio(){
        double portfolio=0;
        for(Stock stock:list){
            portfolio=portfolio+stock.getNumberofStocks()*stock.getStockValue();
        }
        System.out.println("Your Portfolio is "+portfolio);
    }
}
class Stock{
    private String stockName;
    private int numberofStocks;
    private double stockValue;
    public Stock(String stockName, int numberofStocks, double stockValue) {
        this.stockName = stockName;
        this.numberofStocks = numberofStocks;
        this.stockValue = stockValue;
    }
    public String getStockName() {
        return stockName;
    }
    public void setStockName(String stockName) {
        this.stockName = stockName;
    }
    public int getNumberofStocks() {
        return numberofStocks;
    }
    public void setNumberofStocks(int numberofStocks) {
        this.numberofStocks = numberofStocks;
    }
    public double getStockValue() {
        return stockValue;
    }
    public void setStockValue(double stockValue) {
        this.stockValue = stockValue;
    }

}
