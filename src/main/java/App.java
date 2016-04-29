import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("words", Word.getWords());
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      String dictionaryWord = request.queryParams("newWord");
      Word newWord = new Word(dictionaryWord);
      model.put("words", Word.getWords());
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/word/:id", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      Word newWord = Word.find(Integer.parseInt(request.params(":id")));
      model.put("newWord", newWord);
      model.put("definitions", newWord.getDefinitions());
      model.put("template", "templates/word.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/word/:id", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      Word newWord = Word.find(Integer.parseInt(request.queryParams("wordId")));

      String definition = request.queryParams("newDefinition");
      Definition newDefinition = new Definition(definition);

      newWord.addDefinition(newDefinition);

      model.put("definitions", newWord.getDefinitions());

      model.put("newWord", newWord);
      model.put("template", "templates/word.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    // get("/word/:id/new", (request, response) -> {
    //   HashMap<String, Object> model = new HashMap<String, Object>();
    //   Word newWord = Word.find(Integer.parseInt(request.params(":id")));
    //   model.put("newWord", newWord);
    //
    //   model.put("template", "templates/word-definition-form.vtl");
    //   return new ModelAndView(model, layout);
    // }, new VelocityTemplateEngine());
  }
}
