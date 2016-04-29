import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    // staticFileLocation("/public");
    // String layout = "templates/layout.vtl";
    //
    // get("/", (request, response) -> {
    //   HashMap<String, Object> model = new HashMap<String, Object>();
    //   model.put("words", Dictionary.getDictionary());
    //   model.put("template", "templates/index.vtl");
    //   return new ModelAndView(model, layout);
    // }, new VelocityTemplateEngine());
    //
    // post("/", (request, response) -> {
    //   HashMap<String, Object> model = new HashMap<String, Object>();
    //   String dictionaryWord = request.queryParams("newWord");
    //   Dictionary newWord = new Dictionary(dictionaryWord);
    //   model.put("words", Dictionary.getDictionary());
    //   model.put("template", "templates/index.vtl");
    //   return new ModelAndView(model, layout);
    // }, new VelocityTemplateEngine());
    //
    // get("/word/:id", (request, response) -> {
    //   HashMap<String, Object> model = new HashMap<String, Object>();
    //   Dictionary newWord = Dictionary.find(Integer.parseInt(request.params(":id")));
    //   model.put("newWord", newWord);
    //   model.put("template", "templates/word.vtl");
    //   return new ModelAndView(model, layout);
    // }, new VelocityTemplateEngine());
    //
    // get("/word/:id/new", (request, response) -> {
    //   HashMap<String, Object> model = new HashMap<String, Object>();
    //   Dictionary newWord = Dictionary.find(Integer.parseInt(request.params(":id")));
    //   model.put("newWord", newWord);
    //
    //   model.put("template", "templates/word-definition-form.vtl");
    //   return new ModelAndView(model, layout);
    // }, new VelocityTemplateEngine());
  }
}
