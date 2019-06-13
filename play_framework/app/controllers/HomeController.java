package controllers;

import play.mvc.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(views.html.index.render());
    }

    public Result connectFour(){
        return ok(views.html.connectFour.render("CONNECT FOUR MAIN"));
    }

    public Result connectFourReset(){
        return ok(views.html.connectFour.render("SHOW NEW BOARD"));
    }

    public Result connectFourUpdate() {
        return ok(views.html.update.render("SHOW NEW BOARD"));
    }

}
