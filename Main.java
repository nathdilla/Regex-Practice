class Main {
  public static void main(String[] args) {

    System.out.println("*******************************");

    account myAccount = new account();
    myAccount.set_card_number("2342-4543-6948-0385"); //All correct test
    myAccount.set_cvv("222");
    myAccount.set_exp_date("04/55");
    myAccount.set_name("Nathan Dilla");

    System.out.println("*******************************");

    account yourAccount = new account();
    yourAccount.set_card_number("4-r-6941238-0f85"); //incorrect 
    yourAccount.set_cvv("455");
    yourAccount.set_exp_date("April 27, 2025");
    yourAccount.set_name("Joe");

    System.out.println("*******************************");

    account hisAccount = new account();
    hisAccount.set_card_number("4503-4503-4503-4503");
    hisAccount.set_cvv("rar");
    hisAccount.set_exp_date("0212");
    hisAccount.set_name("Alan Turing");

    System.out.println("*******************************");
    
    account herAccount = new account();
    herAccount.set_card_number("0001/2354/0001/3412");
    herAccount.set_cvv("2345");
    herAccount.set_exp_date("02/21");
    herAccount.set_name("Anna Kendrick");

    System.out.println("*******************************");
    
    account theirAccount = new account();
    theirAccount.set_card_number("2342-4543-6948-0385");
    theirAccount.set_cvv("231");
    theirAccount.set_exp_date("08/09");
    theirAccount.set_name("dante joe");

    System.out.println("*******************************");
    
    account ourAccount = new account();
    ourAccount.set_card_number("1234-1234-1234-1234");
    ourAccount.set_cvv("2310");
    ourAccount.set_exp_date("08-09");
    ourAccount.set_name("Joe Dante");
  }
}