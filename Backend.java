import java.io.*;

public class Backend
{
    static String person_name,stock_name;
    static int nos;
    static double buy_price,current_price,tot_amount,profit_loss,tot=0;
    public void name(String nam)
    {
        person_name=nam;
    }
    public void quantity(int n)
    {
        nos=n;
    }
    public void baught_price(double bp)
    {
        buy_price=bp;
    }
    public void current_price(double cp)
    {
        current_price=cp;
    }
    public void stock_name(String sn)
    {
        stock_name=sn;
    }
    public void make_file()
    {
        File f1=new File(String.format("Stocks.txt",true));
        
        try
        {
            if(!f1.exists())
            {
                f1.createNewFile();
                FileWriter fw=new FileWriter(f1);
                fw.write("Name\t\tStock Name\t\tNo of stocks\t\tBuying Price\t\tCurrent price\t\tTotal Amount\t\tProfit or Loss %\n");
                fw.write("----\t\t----------\t\t------------\t\t------------\t\t-------------\t\t------------\t\t----------------\n");
                fw.close();
            }
            FileWriter fw=new FileWriter(f1,true);
            fw.write(person_name+"\t\t"+stock_name+"\t\t\t"+nos+"\t\t\t\t\t"+buy_price+"\t\t\t\t"+current_price+"\t\t\t\t"+tot_amount+"\t\t\t\t"+profit_loss+" %\n");
            fw.close();
        }
        catch(Exception e)
        {
            System.out.println("An Error Occured pls try again...System.err.println");
            // e.printStackTrace();
        }

        File f2=new File(String.format("%s.txt",person_name));
        try
        {
            if(!f2.exists())
            {
                f2.createNewFile();
                FileWriter fw=new FileWriter(f2);
                fw.write("Stock Name\t\t\tTotal Amount\t\t\tProfit Loss %\n");
                fw.write("----------\t\t\t------------\t\t\t----------------\n");
                fw.close();
            }
            FileWriter fw=new FileWriter(f2,true);
            tot+=tot_amount;
            fw.write(stock_name+"\t\t\t\t"+tot_amount+"\t\t\t\t\t"+profit_loss+"% \n");
            fw.close();
        }
        catch(Exception e)
        {
            System.out.println("An Error Occured pls try again...System.err.println");
            // e.printStackTrace();
        }

        double existingAmount=0;
        File f3=new File(String.format("%s_net.txt",person_name));
        try {
            if (!f3.exists()) {
                f3.createNewFile();
            }
            try (BufferedReader b = new BufferedReader(new FileReader(f3))) {
                String line = b.readLine();
                if (line != null && !line.isEmpty()) {
                    existingAmount = Double.parseDouble(line.trim()); // Avoid NullPointerException
                }
            }

            double newAmount = existingAmount + tot_amount;

            // Write updated value back to file (overwrite mode)
            try (FileWriter fw = new FileWriter(f3, false)) { // false -> overwrite file
                fw.write(Double.toString(newAmount));
            }

            System.out.println("Updated amount: " + newAmount);

        } 
        catch (Exception e) {
            e.printStackTrace();
        }

    }

public void readfile()
    {
        File f=new File(String.format("%s.txt",person_name));
        try
        {
            if(f.exists())
            {
                System.out.println("This is the file...");
                BufferedReader b=new BufferedReader(new FileReader(String.format("%s.txt",person_name)));
                String line;
                while((line=b.readLine())!=null)
                {
                    System.out.println(line);
                }
            }
            else
            {
                System.out.println("There is no such file to read...");
            }
        }
        catch(Exception e)
        {
            System.out.println("We came up with a error please try once more...");
            // e.printStackTrace();
        }
        File f1=new File(String.format("%s_net.txt",person_name));
        try
        {
            if(f1.exists())
            {
                System.out.println("Total amount: ");
                BufferedReader b=new BufferedReader(new FileReader(String.format("%s_net.txt",person_name)));
                String line;
                while((line=b.readLine())!=null)
                {
                    System.out.println(line);
                }
            }
            else
            {
                System.out.println("There is no such file to read...");
            }
        }
        catch(Exception e)
        {
            System.out.println("We came up with a error please try once more...");
            // e.printStackTrace();
        }
    }
}