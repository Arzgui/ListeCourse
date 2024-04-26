public class Article {
    private String name;
    private double prixUnitaire;
    private int Quantity;
    private double tva;

    public Article(String name, double prixUnitaire, int quantity, double tva) {
        this.name = name;
        this.prixUnitaire = prixUnitaire;
        Quantity = quantity;
        this.tva = tva;
    }

    public Article(String name, double prixUnitaire, int quantity) {
        this.name = name;
        this.prixUnitaire = prixUnitaire;
        Quantity = quantity;
        tva = 20;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public double getTva() {
        return tva;
    }

    public void setTva(double tva) {
        this.tva = tva;
    }
}
