import spark.Request;
import spark.Response;

import static spark.Spark.get;
import static spark.Spark.notFound;
import static spark.Spark.port;


public class Main {
    public static void main(String[] args) {
        port(2345);
        notFound("404 - Not found");
        get("/hello/:who", Main::handleHello);
    }

    private static String handleHello(Request request, Response response) {
        String who = request.params("who");
        response.body("Hello " + who + "!");
        return response.body();
    }
}
