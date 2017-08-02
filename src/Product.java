
public class Product {


    private int itemNumberM;
    private String categoryM;
    private String itemNameM;
    private String descriptionM;
    private String miscInfoM;
    private double priceM;


    public Product() {

        categoryM = "";
        itemNameM = "";
        descriptionM = "";
        priceM = 0;
        itemNumberM = 0;
    }

    public Product(int itemNumber, String category, String itemName, String description, String miscInfo, double price) {

        itemNumberM = itemNumber;
        categoryM = category;
        itemNameM = itemName;
        descriptionM = description;
        miscInfoM = miscInfo;
        priceM = price;

    }


    public int getItemNumberM() {
        return itemNumberM;
    }

    public void setItemNumberM(int itemNumberM) {
        this.itemNumberM = itemNumberM;
    }

    public String getCategoryM() {
        return categoryM;
    }

    public void setCategoryM(String categoryM) {
        this.categoryM = categoryM;
    }

    public String getItemNameM() {
        return itemNameM;
    }

    public void setItemNameM(String itemNameM) {
        this.itemNameM = itemNameM;
    }

    public String getDescriptionM() {
        return descriptionM;
    }

    public void setDescriptionM(String descriptionM) {
        this.descriptionM = descriptionM;
    }

    public String getMiscInfoM() {
        return miscInfoM;
    }

    public void setMiscInfoM(String miscInfoM) {
        this.miscInfoM = miscInfoM;
    }

    public double getPriceM() {
        return priceM;
    }

    public void setPriceM(double priceM) {
        this.priceM = priceM;
    }


public String toString(){

    String result = "";

    System.out.printf("%-2d %-12s %-18s %-55s %-10s %.2f",itemNumberM ,categoryM, itemNameM, descriptionM, miscInfoM, priceM);

    return result;
}


}
