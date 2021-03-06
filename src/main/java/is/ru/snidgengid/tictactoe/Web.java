package is.ru.snidgengid.tictactoe;

import static spark.Spark.*;

/**
* Implementation of TicTacToe web server (main)
**/
public class Web {

    /**
    * Main initializer for Spark Framework that grants HTTP access to TicTacToe
    *
    * @param args String array - Not used
    */
    public static void main(String[] args) {
        port(getHerokuAssignedPort());
        staticFileLocation("/www");
        get("/newGame", (req, res) -> new GameHandler().newGame(req, res));
        put("/action", (req, res) -> new GameHandler().action(req, res));
    }

    /**
    * Checks if environmental variable PORT is set and returns it, else it returns 4567
    *
    * @return Integer with assigned port for Web Service
    */
    public static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        final int defaultHerokuPort = 4567;
        return defaultHerokuPort; //return default port if heroku-port isn't set (i.e. on localhost)
    }

}

