public class account
{
  private String card_number = "xxxx-xxxx-xxxx";//class vars
  private String cvv = "xxx";
  private String expir_date = "xx/xxxx";
  private String name = "xxxx xxxx";

  public account()//constructor
  {
    this.card_number = "";
    this.cvv = "";
    this.expir_date = "";
    this.name = "";
  }

  public boolean set_card_number(String new_card_number)
  {
    boolean output = false;
    if (new_card_number.matches("^[0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{4}$"))
    {
      System.out.println(new_card_number + " accepted.");
      output = true;
    }
    else
    {
      System.out.println(new_card_number + " : Invalid card number. Must match XXXX-XXXX-XXXX-XXXX");
    }
    return output;
  }

  public boolean set_cvv(String new_cvv)
  {
    boolean output = false;
    if (new_cvv.matches("^[0-9]{3}$"))
    {
      System.out.println(new_cvv + " accepted.");
      output = true;
    }
    else
    {
      System.out.println(new_cvv + " : Invalid cvv. Must match XXX");
    }
    return output;
  }

  public boolean set_exp_date(String new_exp_date)
  {
    boolean output = false;
    if (new_exp_date.matches("^[0-9]{2}[/][0-9]{2}$"))
    {
      System.out.println(new_exp_date + " accepted.");
      output = true;
    }
    else
    {
      System.out.println(new_exp_date + " : Invalid expiration date. Must match XX/XX");
    }
    return output;
  }
  
  public boolean set_name(String new_name)
    {
      boolean output = false;
      if (new_name.matches("[A-Z][a-z]* [A-Z][a-z]*"))
      {
        System.out.println(new_name + " accepted.");
        output = true;
      }
      else
      {
        System.out.println(new_name + " : Invalid name. Must match Xxxx Xxxx");
      }
      return output;
    }
}