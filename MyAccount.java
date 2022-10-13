class Account{
    int acno,balance;
    public void set(int a,int b){
        acno=a;
        balance=b;
    }
    public void get(){
        System.out.println(acno+"  "+balance);
    }
}
public class MyAccount{
    public static void main(String args[]){
        Account a=new Account();
        a.set(9876,10000);
        a.get();
    }
}