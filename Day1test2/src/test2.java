class Movie{
    String title;
    String genre;
    int rating;

    void playIt()
    {
        System.out.println("Playing the movie");
    }
    void ShowName()
    {
        System.out.println(title);
    }

}

public class test2{
    public static void main(String[] arg)
    {
        Movie one = new Movie();
        one.title = "How are you?";
        one.genre = "Tragic";
        one.rating = 2;
        one.playIt();
        one.ShowName();
    }
}