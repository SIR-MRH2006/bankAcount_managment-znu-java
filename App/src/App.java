import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        MellatBank MB1 = new MellatBank("mb1");

        while (true) {
            System.out.println("-----------------------------------------");
            System.out.println("please choose a number : ");
            System.out.println("1)add a acount \n2)withdraw \n3)deposite \n4)showInfo");
            System.out.println("-----------------------------------------\n");
            int userFirstChoice = scanner.nextInt();
            switch (userFirstChoice) {
                case 1:
                    add_acount(MB1,scanner);
                    break;
                case 2:
                    int user_index = find_index(scanner);
                    if(user_index != -1){
                        withdraw(user_index,scanner);
                    }
                    break;
                case 3:
                    int user_index1 = find_index(scanner);
                    if(user_index1 != -1){
                        deposite(user_index1,scanner);
                    }
                    break;
                    case 4:
                    int user_index2 = find_index(scanner);
                    if(user_index2 != -1){
                        show_info(user_index2);
                    }
                    break;
                default:
                    continue;
            }
        }
    }

    public static void add_acount(MellatBank firstBank, Scanner scanner){
        while (true) {
            System.out.println("please enter your bank");
            System.out.println("1)mellat Bank");
    
            int userSecondChoice = scanner.nextInt();
            scanner.nextLine();
            if(userSecondChoice == 1){
                String firstName;
                String lastName;
                while (true) {
                    System.out.println("please enter first name : ");
                    firstName = scanner.nextLine();
                    if(firstName.length() > 0){
                        break;
                    }else if(firstName == "0"){
                        // return; //برای برگشت به سوال قبل که جاوا پشتیبانی نمیکنه.
                    }else{
                        continue;
                    }
                }
                while (true) {
                    System.out.println("please enter last name : ");
                    lastName = scanner.nextLine();
                    if(lastName.length() > 0){
                        break;
                    }else if(lastName == "0"){
                        // return;
                    }else{
                        continue;
                    }
                }
                firstBank.add_user(firstName, lastName);
                System.out.println("user successfully added. \n");  
            }else{
                continue;
            }
            break;
        }
    }

    // 
    public static int find_index(Scanner scanner){
        System.out.println("please enter userName : ");
        scanner.nextLine();
        String userName = scanner.nextLine();
        boolean isexist = false;
        for(int i = 0;i<MellatBank.countOfBankUser;i++){
            if(userName.equals(MellatBank.users[i].userFName+" "+MellatBank.users[i].userLName)){
                isexist = true;
                return i;
            }
        }
        if(!isexist){
            System.out.println("\nuser not found!!!!!!!!!!!!!\n");
            return -1;
        }
        return -1;
    }

    public static void withdraw(int user_index,Scanner scanner){
        System.out.println("please enter your amount that want withdraw : ");
        int amount = scanner.nextInt();
        scanner.nextLine();
        // اگر داشته باشه اون مقدار موجودی رو کم بشه ازش.
        UsersOfBank user = MellatBank.users[user_index];
        user.withdraw(amount);
    }
    
    public static void deposite(int user_index,Scanner scanner){
        System.out.println("please enter your amount that want deposite : ");
        int amount = scanner.nextInt();
        scanner.nextLine();

        System.out.println("sssssssssssssssss");
        System.out.println(user_index);
        // اگر داشته باشه اون مقدار موجودی رو کم بشه ازش.
        UsersOfBank user = MellatBank.users[user_index];
        user.deposite(amount);
    }

    public static void show_info(int user_index2){
        UsersOfBank user = MellatBank.users[user_index2];
        user.user_info();
    }
}
