package es.uah.matcomp.mp.el1.Practica1;

public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(String i, String d, int q, double u) {
        this.id = i;
        this.desc = d;
        this.qty = q;
        this.unitPrice = u;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQty() {
        return qty;
    }

    public String getDesc() {
        return desc;
    }

    public String getId() {
        return id;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return unitPrice * qty;
    }

    public String toString() {
        return "Invoice item[id= " + id +
                ",desc=" + desc + "qty=" + qty +
                "unitPrice=" + unitPrice + "]";
    }

}
