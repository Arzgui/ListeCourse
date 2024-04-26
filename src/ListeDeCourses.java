import java.util.*;

public class ListeDeCourses {

        ArrayList<Article> listeDeCourses = new ArrayList<>();



    public double calculerTotal() {
        double total = 0.0;
        for (Article action : listeDeCourses) {
            double tva1 = action.getTva() /100;
            total += ((action.getPrixUnitaire()+(action.getPrixUnitaire() * tva1)) * action.getQuantity());
        }
        return total;
    }

    public void afficherListe() {
        for (Article articles : listeDeCourses) {
            System.out.println(articles.getName() + articles.getTva());
        }
    }

    public  void ajouterArticle(Article article) {
       listeDeCourses.add(article);
    }

    public void  retirerArticle(String name) {
        Article removeArticle = null;
        for (Article article : listeDeCourses) {
            if(article.getName().equals(name)) {
                removeArticle = article;
            }

        }
        listeDeCourses.remove(removeArticle);
    }


}

//ix TTC (en €) = Prix HT (en €) x (1 + Taux TVA (en %) )