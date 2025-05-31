import java.util.Scanner;

class Item{
        private String description;
        private String name;
        private double unitPrice;
        private int quantityAvailable;
        Scanner sc = new Scanner(System.in);

 //making consyructor  for item class
    Item(String description,String name,double unitPrice,int quantityAvailable){
        this.description=description;
        this.name=name;
        this.unitPrice=unitPrice;
        this.quantityAvailable=quantityAvailable;
    }

 //getters and setters for Item class
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description=description;
    }

    public String getName(){
        return name;
    }
    public void setDescription(String name){
        this.name=name;
    }

    public double getUnitPrice(){
        return unitPrice;
    }
    public void setUnitPrice(String unitPrice){
        this.unitPrice=unitPrice;
    }

    public int getQuantityAvailable(){
        return quantityAvailable;
    }
    public void setQuantityAvailable(String quantityAvailable){
        this.quantityAvailable=quantityAvailable;
    }

    

        public void updateQuantity(int amount){
            System.out.println("what you want to do? to add press 1,to delete press 2");
            int op = sc.nextInt;

            try {
                        switch (op) {
                            case 1:
                                System.out.println("What quantity do you want to Add?");
                                int addQ = sc.nextInt;
                                Quantity = Quantity + addQ;
                                setQuantityAvailable = setQuantityAvailable - addQ;
                                break;
                            case 2:
                                System.out.println("What quantity do you want to delete?");
                                int addQ = sc.nextInt;
                                Quantity = Quantity - addQ;
                                setQuantityAvailable = setQuantityAvailable + addQ;
                                break;
                                return;
                            default:
                                throw new IllegalArgumentException("Invalid input! Please enter 1 or 2.");
                        }
                        
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }

        }
        public void printDetails(){
            System.out.println(".............Details..............");
            System.out.println("Item           price           Quantity         Amount ");


            System.out.println(".............You are welcome..............");
        }


}


class Customer{
    private String Name;
    private String contactDetails;

    Customer(String Name,String contactDetails){
        this.Name=Name;
        this.contactDetails=contactDetails;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

      public String gatContactDetails(){
        return contactDetails;
    }
    public void setContactDetails(String contactDetails){
        this.contactDetails=contactDetails;
    }


}


Public class Database{

    public static void main(String []args){
        
            System.out.println("..............Inventory management.............");
            System.out.println("1.Add Item");
            System.out.println("2.Remove Item");
            System.out.println("3.Update Item Quantity");
            System.out.println("4.List All Items");
            System.out.println("5.Add customer");
            System.out.println("6.List All customers");
            System.out.println("7.Search Item By Name");
            System.out.println("0.Exit");
            System.out.println("Enter your choise:");

            int choice = sc.nextInt;

            try{
                switch(choice){
                    case 1:

                        break;

                    case 2:

                        break;

                    case 3:

                        break;

                    case 4:

                        break;

                    case 5:

                        break;

                    case 6:

                        break;

                    case 7:

                        break;

                    case 0:

                        break;

                    default:
                        throw new IllegalArgumentException("Invalid input plz input valid");
                 }
                }
                }catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }


            

    }



