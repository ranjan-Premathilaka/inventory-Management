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






}



