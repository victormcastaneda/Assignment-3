public class Customer {
    private int customer_id;
    private String customer_name;
    private String customer_address;
    private int phone_number;
    private float sales_tax;

    public Customer(String name, String address, int phone, float tax) {
        customer_name = name;
        customer_address = address;
        phone_number = phone;
        sales_tax = tax;
    }

    int getID(){
        return customer_id;
    }

    String getCustomerName() {
        return customer_name;
    }

    String getCustomerAddress() {
        return customer_address;
    }

    void setPhone(int phone){
        phone_number = phone;
    }
    
    int getPhone(){
        return phone_number;
    }
    
    void setSalesTax(float salesTax){
        sales_tax = salesTax;
    }
    
    float getSalesTax(){
        return sales_tax;
    }
    

}
