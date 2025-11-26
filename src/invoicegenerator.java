import java.util.Scanner;

public class invoicegenerator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ----------- USER INPUT -----------
        System.out.println("Enter Bill To Name:");
        String billName = sc.nextLine();

        System.out.println("Enter Bill To Address Line 1:");
        String billAddress1 = sc.nextLine();
        System.out.println("Enter Bill To Address Line 2:");
        String billAddress2 = sc.nextLine();
        System.out.println("Enter Bill To Address Line 3:");
        String billAddress3 = sc.nextLine();
        System.out.println("Enter Contact:");
        String contact1 = sc.nextLine();
        System.out.println("Enter Email:");
        String email1= sc.nextLine();

        System.out.println("Enter Ship To Name:");
        String shipName = sc.nextLine();

        System.out.println("Enter Ship To Address Line 1:");
        String shipAddress1 = sc.nextLine();
        System.out.println("Enter Ship To Address Line 2:");
        String shipAddress2 = sc.nextLine();
        System.out.println("Enter Ship To Address Line 3:");
        String shipAddress3 = sc.nextLine();
        System.out.println("Enter Contact:");
        String contact2 = sc.nextLine();
        System.out.println("Enter Email:");
        String email2 = sc.nextLine();


        // ----- PRODUCT INPUT (7 products, no arrays allowed) -----
        System.out.println("Enter Product Code:");
        String Code1 = sc.nextLine();
        System.out.println("Enter product 1 name:");
        String product1 = sc.nextLine();
        System.out.println("Enter HSN code:");
        String hcode1 = sc.nextLine();
        System.out.println("Enter Quantity:");
        int quantity1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Units:");
        String unit1 = sc.nextLine();
        System.out.println("Enter Rate:");
        double rate1 = sc.nextDouble();
        System.out.println("Enter Tax:");
        double tax1 = sc.nextDouble();
        double amount1 = (quantity1* rate1 * tax1/100)+(quantity1*rate1);

        sc.nextLine(); // clear buffer
        System.out.println("Enter Product Code:");
        String Code2 = sc.nextLine();
        System.out.println("Enter product 2 name:");
        String product2 = sc.nextLine();
        System.out.println("Enter HSN code:");
        String hcode2 = sc.nextLine();
        System.out.println("Enter Quantity:");
        int quantity2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Units:");
        String unit2 = sc.nextLine();
        System.out.println("Enter Rate:");
        double rate2 = sc.nextDouble();
        System.out.println("Enter Tax:");
        double tax2 = sc.nextDouble();
        double amount2 = (quantity2* rate2 * tax2/100)+(quantity2*rate2);

        sc.nextLine();
        System.out.println("Enter Product Code:");
        String Code3 = sc.nextLine();
        System.out.println("Enter product 3 name:");
        String product3 = sc.nextLine();
        System.out.println("Enter HSN code:");
        String hcode3 = sc.nextLine();
        System.out.println("Enter Quantity:");
        int quantity3 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Units:");
        String unit3 = sc.nextLine();
        System.out.println("Enter Rate:");
        double rate3 = sc.nextDouble();
        System.out.println("Enter Tax:");
        double tax3 = sc.nextDouble();
        double amount3 = (quantity3* rate3 * tax3/100)+(quantity3*rate3);

        sc.nextLine();
        System.out.println("Enter Product Code:");
        String Code4 = sc.nextLine();
        System.out.println("Enter product 4 name:");
        String product4 = sc.nextLine();
        System.out.println("Enter HSN code:");
        String hcode4 = sc.nextLine();
        System.out.println("Enter Quantity:");
        int quantity4 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Units:");
        String unit4 = sc.nextLine();
        System.out.println("Enter Rate:");
        double rate4 = sc.nextDouble();
        System.out.println("Enter Tax:");
        double tax4 = sc.nextDouble();
        double amount4 = (quantity4* rate4 * tax4/100)+(quantity4*rate4);

        sc.nextLine();
        System.out.println("Enter Product Code:");
        String Code5 = sc.nextLine();
        System.out.println("Enter product 5 name:");
        String product5 = sc.nextLine();
        System.out.println("Enter HSN code:");
        String hcode5 = sc.nextLine();
        System.out.println("Enter Quantity:");
        int quantity5 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Units:");
        String unit5 = sc.nextLine();
        System.out.println("Enter Rate:");
        double rate5 = sc.nextDouble();
        System.out.println("Enter Tax:");
        double tax5 = sc.nextDouble();
        double amount5 = (quantity5* rate5 * tax5/100)+(quantity5*rate5);

        sc.nextLine();
        System.out.println("Enter Product Code:");
        String Code6 = sc.nextLine();
        System.out.println("Enter product 6 name:");
        String product6 = sc.nextLine();
        System.out.println("Enter HSN code:");
        String hcode6 = sc.nextLine();
        System.out.println("Enter Quantity:");
        int quantity6 = sc.nextInt();
        System.out.println("Enter Units:");
        sc.nextLine();
        String unit6 = sc.nextLine();
        System.out.println("Enter Rate:");
        double rate6 = sc.nextDouble();
        System.out.println("Enter Tax:");
        double tax6 = sc.nextDouble();
        double amount6 = (quantity6* rate6 * tax6/100)+(quantity6*rate6);

        sc.nextLine();
        System.out.println("Enter Product Code:");
        String Code7 = sc.nextLine();
        System.out.println("Enter product 7 name:");
        String product7 = sc.nextLine();
        System.out.println("Enter HSN code:");
        String hcode7 = sc.nextLine();
        System.out.println("Enter Quantity:");
        int quantity7 = sc.nextInt();
        System.out.println("Enter Units:");
        sc.nextLine();
        String unit7 = sc.nextLine();
        System.out.println("Enter Rate:");
        double rate7 = sc.nextDouble();
        System.out.println("Enter Tax:");
        double tax7 = sc.nextDouble();
        double amount7 = (quantity7* rate7 * tax7/100)+(quantity7*rate7);

        // ---------- Calculations ----------
        double total = amount1 + amount2 + amount3 + amount4 + amount5 + amount6 + amount7;

        double discountRate = 0.64389 / 100.0;
        double discount = total * discountRate;

        double grandTotal = total - discount;

        // ---------- OUTPUT IN INVOICE FORMAT ----------
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("                         INVOICE");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.printf("%-40s %-20s%n", "Bill To:", "Ship To:");
        System.out.printf("%-40s %-20s%n", billName, shipName);
        System.out.printf("%-40s %-20s%n", billAddress1, shipAddress1);
        System.out.printf("%-40s %-20s%n", billAddress2, shipAddress2);
        System.out.printf("%-40s %-20s%n", billAddress3, shipAddress3);
        System.out.printf("%-40s %-20s%n", contact1, contact2);
        System.out.printf("%-40s %-20s%n", email1, email2);

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.printf("\t\tPayment Date: 7 days from date delivery\t\t\tPayment terms:100%% against invoice\n");
        sc.nextLine();
        System.out.printf("%-5s %-10s %-10s %-10s %-10s %-10s %-10s %-5s\n",
                "S.No", "Product Code", "Product Name","HSN code", "quantity", "Units", "Rate", "Amount");

        System.out.printf("%-5d %-10s %-10s %-10s %-10d %-10s %-1.0f%% %-4.2f\n",
                1, Code1, product1, hcode1, quantity1, unit1, rate1, amount1);
        System.out.printf("%-5d %-10s %-10s %-10s %-10d %-10s %-1.0f%% %-4.2f\n",
                2, Code2, product2, hcode2, quantity2, unit2, rate2, amount2);
        System.out.printf("%-5d %-10s %-10s %-10s %-10d %-10s %-1.0f%% %-4.2f\n",
                3, Code3, product3, hcode3, quantity3, unit3, rate3, amount3);
        System.out.printf("%-5d %-10s %-10s %-10s %-10d %-10s %-1.0f%% %-4.2f\n",
                4, Code4, product4, hcode4, quantity4, unit4, rate4, amount4);
        System.out.printf("%-5d %-10s %-10s %-10s %-10d %-10s %-1.0f%% %-4.2f\n",
                6, Code6, product6, hcode6, quantity6, unit6, rate6, amount6);
        System.out.printf("%-5d %-10s %-10s %-10s %-10d %-10s %-1.0f%% %-4.2f\n",
                7, Code7, product7, hcode7, quantity7, unit7, rate7, amount7);

        System.out.println("------------------------------------------------------------------------------------------------");

        System.out.printf("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tTotal: %.2f\n", total);
        System.out.printf("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tDiscount: %.2f\n", discount);
        System.out.printf("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tGrand Total: %.2f\n", grandTotal);

        System.out.println("----------------------------------------------------------------------------------------------------");
    }
}