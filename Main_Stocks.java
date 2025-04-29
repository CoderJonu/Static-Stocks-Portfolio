import java.util.Scanner;

public class Main_Stocks {
    public static void main(String[] args)
    {
        
        Backend b=new Backend();
        Scanner s=new Scanner(System.in);
        System.out.println("Welcome to the Stock Market...");
        System.out.println("Enter your name: ");
        String name=s.nextLine();
        b.name(name);
        while (true)
        {
            System.out.println("1. Add a new Stock\n2. View Stocks\n3. Exit");
            System.out.println("Enter your choice:");
            int ch=s.nextInt();
            switch(ch)
            {
                case 1:
                    Users u=new Users();
                    u.entry();
                    u.makefile();
                    break;
                case 2:
                    Stocks st=new Stocks();
                    st.read_file();
                    break;
                case 3:
                    System.out.println("Exiting Stock Portfolio");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}
class Stocks
{
    Backend b=new Backend();
    public void Display()
    {
        System.out.println("List of Stock companies: ");
        System.out.println("1. Apple Inc.");
        System.out.println("2. Microsoft Corporation");
        System.out.println("3. Amazon.com Inc.");
        System.out.println("4. Alphabet Inc.");
        System.out.println("5. Facebook Inc.");
        System.out.println("6. Tesla Inc.");
        System.out.println("7. Berkshire Hathaway Inc.");
        System.out.println("8. JPMorgan Chase & Co.");
        System.out.println("9. Johnson & Johnson");
        System.out.println("10. Visa Inc.");
    }
    public void makefile()
    {
        b.make_file();
        System.out.println("The file was created...");
    }
    public void read_file()
    {
        b.readfile();
    }
}
interface Accounting
{
    Backend b = new Backend();
    public static void displayAccountingInfo() {
        System.out.println("Your Total Amount is: " + b.tot_amount);
        System.out.println("Your Profit or Loss is: " + b.profit_loss + " %");
    }
}
interface Computing
{
    Backend b = new Backend();
    public static void computingg(int nos, double buy_price, double current_price)
    {
        double buy=buy_price, current=current_price;
        int no=nos;
        double totamount=no*buy;
        double profitloss=((current-buy)/buy)*100;
        Backend.tot_amount=totamount;
        Backend.profit_loss=profitloss;
    }
}
class Users extends Stocks implements Accounting,Computing
{
    Backend b=new Backend();
    public void entry()
    {
        Stocks st=new Stocks();
        Scanner s=new Scanner(System.in);
        st.Display();
        System.out.println("Enter your choice: ");
        boolean v=false;
        while(!v)
        {
            int ch=s.nextInt();
            switch(ch)
        {
            case 1:
                    b.stock_name("AAIP");
                    v=true;
                    break;
            case 2:
                    b.stock_name("MICP");
                    v=true;
                    break;
            case 3:
                    b.stock_name("AMAC");
                    v=true;
                    break;
            case 4:
                    b.stock_name("ALIN");
                    v=true;
                    break;
            case 5:
                    b.stock_name("FAIC");
                    v=true;
                    break;
            case 6:
                    b.stock_name("TEIN");
                    v=true;
                    break;
            case 7:
                    b.stock_name("BEHA");
                    v=true;
                    break;
            case 8:
                    b.stock_name("JPCH");
                    v=true;
                    break;
            case 9:
                    b.stock_name("JOJO");
                    v=true;
                    break;
            case 10:
                    b.stock_name("VIIN");
                    v=true;
                    break;
            default:
                    System.out.println("Invalid choice.");
                    break;
                }
        }
        System.out.println("Enter the number of stocks you want to buy: ");
        int nos=s.nextInt();
        b.quantity(nos);
        System.out.println("Enter the buying price of the stock: ");
        double buy_price=s.nextDouble();
        b.baught_price(buy_price);
        System.out.println("Enter the current price of the stock: ");
        double current_price=s.nextDouble();
        b.current_price(current_price);
        Computing.computingg(nos, buy_price, current_price);
        Accounting.displayAccountingInfo();
    }
}