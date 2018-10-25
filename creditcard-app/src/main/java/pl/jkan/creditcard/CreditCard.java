package pl.jkan.creditcard;

class CreditCard {
    private boolean blocked = false;
    public void assignLimit(double limit) {
        
    }   
    
    public void Block(){
        this.blocked = true;
    }
    
    public boolean isBlocked(){
        return this.blocked;
    }
    
    public double getLimit() {
        return 2000;
    }
}