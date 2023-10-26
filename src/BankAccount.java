class BankAccount {
    private String name;
    private int age;
    private int account_Num;
    private double deposit;
    private double balance;
    
    
public String getName(){
    return name;
}
public void setName(String name){
    this.name=name;
}  
public int getAge(){
    return age;
} 
public void setAge(int age){
    this.age=age;
}
public int getAccount_Num(){
    return account_Num;
}
public void setAccount_Num(int account_Num){
   this.account_Num=account_Num;   
}
public double setdeposit(int deposit){
   return deposit;     
}
public double getBalance(){
    return balance;
}

public void setBalance(double deposit1,double deposit2){
    this.balance=deposit1+deposit2;
}
   
    }



class main{
    public static void main(String[] args){
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount();
        
        b1.setName("Alieza Balles");
        b1.setAge(19);
        b1.setAccount_Num(1234567);
        b1.setdeposit(100000);
        b1.setBalance(20000, 35432);
        
        
       System.out.println("Name: " + b1.getName());
       System.out.println("Age: " + b1.getAge());
       System.out.println("Account Number: " + b1.getAccount_Num());
       System.out.println("Balance: " + b1.getBalance());
       
       
       
    }
}
