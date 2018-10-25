package pl.jkan.creditcard;

class CreditCard {
    private double balance = 0;
    private double cardlimit = 0;
    public void assignLimit(double limit) {
        balance = limit;
        cardlimit = limit;
    }   
    
    public void withdraw(double money){
        balance = balance - money;
    }
    
    public double getCountBalance(){
        return balance;
    }
    
    public double getLimit() {
        return 2000;
    }
}