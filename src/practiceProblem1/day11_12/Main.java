package practiceProblem1.day11_12;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {

    }
}
class CompanyShares{
    private String stockName;
    private int stockNumber;
    private double stockPrice;
    public CompanyShares(String stockName) {
        this.stockName = stockName;
    }

    public CompanyShares(String stockName, int stockNumber, double stockPrice) {
        this.stockName = stockName;
        this.stockNumber = stockNumber;
        this.stockPrice = stockPrice;
    }

    public String getStockName() {
        return stockName;
    }
    public int getStockNumber() {
        return stockNumber;
    }
    public double getStockPrice() {
        return stockPrice;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public void setStockNumber(int stockNumber) {
        this.stockNumber = stockNumber;
    }

    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
    }
    public double getStockValue(){
        return stockPrice*stockNumber;
    }

}
class StockAccount{
    List<CompanyShares> list=new ArrayList<>();
    public void save(String stockName){
        list.add(new CompanyShares(stockName));
    }
    public void buy(int numberOfStocks,double stockPrice,String symbol){
        boolean flag=true;
        for(CompanyShares shares:list){
            if(shares.getStockName().equalsIgnoreCase(symbol)){
                shares.setStockNumber(shares.getStockNumber()+numberOfStocks);
                shares.setStockPrice(stockPrice);
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("Stock you are looking at isnot available");
        }
    }
    public void sell(String symbol,int numberOfStocks){
        boolean flag=true;
        for(CompanyShares shares:list){
            if(shares.getStockName().equalsIgnoreCase(symbol)){
                if(shares.getStockNumber() >= numberOfStocks){
                    shares.setStockNumber(shares.getStockNumber()-numberOfStocks);
                    flag=false;
                    break;
                }
                else{
                    System.out.println("insufficient stock number");
                }
            }
        }
        if(flag){
            System.out.println("Stock you are looking at isnot available");
        }
    }
    public double valueOf(){
        Double portfolio=0.0;
        for(CompanyShares shares:list){
            portfolio=portfolio+shares.getStockValue();
        }
        return portfolio;
    }
    public void printReport(){
        for(CompanyShares shares:list){
            System.out.println(shares.getStockName()+" Stock has "+shares.getStockNumber()+" with a Stock Price Of "+shares.getStockPrice()+" abd you will get "+shares.getStockValue()+" dollars");
        }
    }
}
