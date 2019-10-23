import static spark.Spark.*;
public class prueba {

    public static void main(String[] args) {
        get("/hello", (req, res) -> "no ps wao...");
        
    }
}