public class UsersOfBank implements ITransaction , IAccountManagement {
    String userFName;
    String userLName;
    String acountNumber;
    int balance;

    public UsersOfBank(String userFName,String userLName,String acountNumber){
        this.userFName = userFName;
        this.userLName = userLName;
        this.balance = 0; // if you dont write => its correct run too
        this.acountNumber = acountNumber;
    }

    public void withdraw(int amount){
        if(amount < (this.balance-1000)){
            this.balance -= amount;
            System.out.println("_________________ receipt _________________");
            System.out.println("your previos balance : " + (this.balance+amount));
            System.out.println("your amount : "+ amount);
            System.out.println("your persent balance : "+this.balance);
            System.out.println("successfully done");
            System.out.println("___________________________________________\n");
        }else{
            System.out.println("????????????????????????");
            System.out.println("you dont have enough money!!!");
        }
    }

    public void deposite(int amount){
        this.balance += amount;
        System.out.println("_________________ receipt _________________");
        System.out.println("your previos balance : " + (this.balance-amount));
        System.out.println("your amount : "+ amount);
        System.out.println("your persent balance : "+this.balance);
        System.out.println("successfully done");
        System.out.println("___________________________________________\n");
    }

    public void check_balance(){
        System.err.println("your present balance is : "+this.balance);
    }

    public void user_info(){
        System.out.println("\n--------shooow_info--------");
        System.out.println("userName : "+this.userFName+" "+this.userLName+"\n"+"acount number : "+this.acountNumber+"\n"+"balance : "+this.balance);
        System.out.println("----------------\n");
    }

}