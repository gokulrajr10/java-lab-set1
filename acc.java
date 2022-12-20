//class and objects
//1
class account{
    int acc_no;
    String name;
    float amount;
    void insert(int a,String b,float c){
        acc_no=a;
        name=b;
        amount=c;
    }
    void deposit(float a){
        System.out.println("\nDeposited amount = "+a);
        amount=amount+a;
    }
    void withdraw(float a){
        if(a<amount){
            System.out.println("\nWithdraw amount = "+a);
            amount=amount-a;
        }
        else{
            System.out.println("\nInsufficient amount");
        }
    }
    void check_status(){
        System.out.println("\nBalance amount = "+amount);
    }
    void display(){
        System.out.println("\nAccount number = "+acc_no);
        System.out.println("Name = "+name);
        System.out.println("Amount = "+amount);
    }
}
class acc{
    public static void main(String[] args){
        account a=new account();
        a.insert(25,"goku",50000);
        a.display();
        a.deposit(25000);
        a.check_status();
        a.withdraw(20000);
        a.check_status();
    }
}