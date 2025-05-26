public class MellatBank extends CommercialBank {
    static UsersOfBank[] users = new UsersOfBank[50];
    public static int countOfBankUser = 0;
    static String bankCode = "6063";

    public MellatBank(String bankName){
        super(bankName,bankCode);
    }

    public void add_user(String userFName,String userLname){
        // compute count of zero that we want to creat account number.
        String middleSpace = "";    
        for(int i = 0;i<12-String.valueOf(MellatBank.countOfBankUser).length();i++){
            middleSpace += "0";
        }
        String acountNumber = bankCode+middleSpace+MellatBank.countOfBankUser;
        UsersOfBank newUser = new UsersOfBank(userFName,userLname,acountNumber);
        MellatBank.users[MellatBank.countOfBankUser] = newUser;
        MellatBank.countOfBankUser += 1;
    }

    public void show_users(){
        for(int i = 0;i<MellatBank.countOfBankUser;i++){
            System.out.println(MellatBank.users[i].userFName);
            System.out.println(MellatBank.users[i].userLName);
            System.out.println(MellatBank.users[i].acountNumber);
            System.out.println(MellatBank.users[i].balance);
            System.out.println("----------------------------------");
        }
    }
}