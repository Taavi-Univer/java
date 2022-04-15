package MyFirstApp;

class Movie {
    String title;
    String genre;
    int rating;
}

public class Movies {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Title 1";
        one.genre = "genre1";
        one.rating = 1;

        Movie two = new Movie();
        two.title = "Title 2";
        two.genre = "genre2";
        two.rating = 2;

        System.out.println(one.title);
        System.out.println(two.title);
    }

}
