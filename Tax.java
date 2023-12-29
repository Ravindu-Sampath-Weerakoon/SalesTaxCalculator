import java.text.NumberFormat;

public class Tax {
    String productName = null;
    float price = 0.0f;
    boolean imported = false;
    boolean exempted = false;
    float tax = 0.0f;
    float taxedPrice =0.0f;

    public Tax(){}

    public Tax(String productName, float price, boolean imported , boolean exempted){
        this.productName = productName;
        this.price = price;
        this.imported = imported;
        this.exempted = exempted;
    }

    public void storeTheAmountOfTax(){
        if(this.imported){
            if (!this.exempted){
                this.tax = this.price*10/100;
            }else{
                this.tax = this.price*2/100;
            }
        }
    }

    public void calculateAndSoreTheTaxedPrice(){
        storeTheAmountOfTax();
        this.taxedPrice = this.price + this.tax ;

    }

    public void printTheDetailsOfTaxObject(){
        calculateAndSoreTheTaxedPrice();

        final NumberFormat NUMBER_IT_CURRENCY_FORMAT = NumberFormat.getCurrencyInstance();

        System.out.println(" The product name: " + this.productName);
        System.out.println(" Price of the product : " + NUMBER_IT_CURRENCY_FORMAT.format(this.price));
        System.out.println(" Tax of the product : " + NUMBER_IT_CURRENCY_FORMAT.format(this.tax));
        System.out.println(" Taxed price is : " + NUMBER_IT_CURRENCY_FORMAT.format(this.taxedPrice));

    }
}
