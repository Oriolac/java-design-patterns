package cat.udl.ampli.observer.saleobserver;

public class CreateSalesLineItemDTO {
    public final String description;
    public final int price;
    public final int accumTotal;

    public CreateSalesLineItemDTO(String description, int price, int accumTotal) {
        this.description = description;
        this.price = price;
        this.accumTotal = accumTotal;
    }
}
