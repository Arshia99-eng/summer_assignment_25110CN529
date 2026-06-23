import java.util.*;
class inventory
{
    static Scanner in = new Scanner(System.in);
    static int n;
    static String pid[];
    static String pname[];
    static int qty[];
    static double price[];
    static void addProducts()
    {
        for(int i=0;i<n;i++)
        {
            System.out.println("Product " + (i+1));

            System.out.print("Enter Product ID: ");
            pid[i] = in.nextLine();

            System.out.print("Enter Product Name: ");
            pname[i] = in.nextLine();

            System.out.print("Enter Quantity: ");
            qty[i] = in.nextInt();

            System.out.print("Enter Price: ");
            price[i] = in.nextDouble();

            in.nextLine();
        }
    }
    static void searchProduct()
    {
        System.out.print("Enter Product ID: ");
        String id = in.nextLine();

        for(int i=0;i<n;i++)
        {
            if(pid[i].equalsIgnoreCase(id))
            {
                System.out.println("Product Found");
                System.out.println("Name     : " + pname[i]);
                System.out.println("Quantity : " + qty[i]);
                System.out.println("Price    : " + price[i]);
                return;
            }
        }

        System.out.println("Product Not Found");
    }
    static void updateStock()
    {
        System.out.print("Enter Product ID: ");
        String id = in.nextLine();

        for(int i=0;i<n;i++)
        {
            if(pid[i].equalsIgnoreCase(id))
            {
                System.out.print("Enter Quantity to Add: ");
                int add = in.nextInt();
                in.nextLine();

                qty[i] += add;

                System.out.println("Stock Updated Successfully");
                return;
            }
        }

        System.out.println("Product Not Found");
    }
    static void displayInventory()
    {
        System.out.printf("%-12s %-25s %-12s %-12s%n",
                "Product ID","Product Name","Quantity","Price");

        for(int i=0;i<n;i++)
        {
            System.out.printf("%-12s %-25s %-12d %-12.2f%n",
                    pid[i],pname[i],qty[i],price[i]);
        }
    }
    public static void main(String[] args)
    {
        System.out.print("Enter Number of Products: ");
        n = in.nextInt();
        in.nextLine();
        pid = new String[n];
        pname = new String[n];
        qty = new int[n];
        price = new double[n];
        while(true)
        {
            System.out.println("\n===== INVENTORY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Products");
            System.out.println("2. Search Product");
            System.out.println("3. Update Stock");
            System.out.println("4. Display Inventory");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");
            int ch = in.nextInt();
            in.nextLine();
            switch(ch)
            {
                case 1:
                    addProducts();
                    break;

                case 2:
                    searchProduct();
                    break;

                case 3:
                    updateStock();
                    break;

                case 4:
                    displayInventory();
                    break;

                case 5:
                    System.out.println("Program Ended");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}