
import static spark.Spark.*;

public class prueba {

    public static void main(String[] args) {

        get("/hello", (req, res) -> "Probando, uno dos.");

        get("/estudiantes", (req, res) -> {

            res.type("application/json");
            return "{\"id: 1\", \"nombre: Erick Agrazal\", \"edad: 28\"}, {\"id: 2\", \"nombre: Vicente Lopez\", \"edad: 28\"}, {\"id: 3\", \"nombre: Pedro Navaja\", \"edad: 65\"}";
        
        });
        

        get("/estudiantes/1", (req, res) -> {

            res.type("application/json");
            return "{\"id: 1\", \"nombre: Erick Agrazal\", \"edad: 28\"}";
        
        });

        get("/estudiantes/2", (req, res) -> {

            res.type("application/json");
            return "{\"id: 2\", \"nombre: Vicente Lopez\", \"edad: 28\"}";
        
        });

        get("/estudiantes/3", (req, res) -> {

            res.type("application/json");
            return "{\"id: 3\", \"nombre: Pedro Navaja\", \"edad: 65\"}";
        
        });



        
    }
}