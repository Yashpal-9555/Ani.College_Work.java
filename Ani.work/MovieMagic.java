import java.util.*;

public class MovieMagic {
    int year ;
    String title;
    float rating;

    MovieMagic(){
        year = 0;
        title  = "";
        rating = (float) 0.0;
    }
    
    MovieMagic(int year , String title , float rating){
        this.year = year;
        this.title = title;
        this.rating = rating;
    }
     void accept(){
        Scanner sc = new Scanner(System.in);
        this.year = sc.nextInt();
        this.title = sc.next();
        this.rating = sc.nextFloat();
        sc.close();


    }

    void display(){
        System.out.println("Movie title : " + this.title);
            if (rating >= 0 && rating <= 2.0) {
                System.out.println("Flop");
            } else if (rating >= 2.1 && rating <= 3.4) {
                System.out.println("Semi-hit");
            } else if (rating >= 3.5 && rating <= 4.5) {
                System.out.println("Hit");
            } else if (rating >= 4.6 && rating <= 5.0) {
                System.out.println("Super Hit");
            }
                
    }
    public static void main(String[] args) {


        MovieMagic movieMagic = new MovieMagic();
        movieMagic.accept();
        movieMagic.display();
        

        
    }

    
}