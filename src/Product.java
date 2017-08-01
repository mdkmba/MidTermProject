
public class Product {


    private int itemNumberM;
    private String categoryM;
    private String itemNameM;
    private String descriptionM;
    private String miscInfoM;
    private double priceM;

    public Product() {
        itemNumberM = 0;
        categoryM = "";
        itemNameM = "";
        descriptionM = "";
        priceM = 0;
    }

    public Product(int itemNumber, String category, String itemName, String description, double price) {
        itemNumberM = itemNumber;
        categoryM = category;
        itemNameM = itemName;
        descriptionM = description;
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





}
