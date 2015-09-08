public class Newspaper {

    private String nameOfPaper;
    private double price;


    public Newspaper(String nameOfPaper, double price) {
        this.nameOfPaper = nameOfPaper;
        this.price = price;
    }

    public String getNameOfPaper() {
        return nameOfPaper;
    }

    public void setNameOfPaper(String nameOfPaper) {
        this.nameOfPaper = nameOfPaper;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
