package controllers;

import db.Seeds;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;

public class HomeController {

    public static void main(String[] args) {

        Seeds.seedData();

        AdminController adminController = new AdminController();
        ArticleController articleController = new ArticleController();
        CategoryController categoryController = new CategoryController();
        TagController tagController = new TagController();
        VisitorController visitorController = new VisitorController();
        WriterController writerController = new WriterController();

        get("/", (req, res) -> {
            Map<String, Object> model= new HashMap();
            model.put("template", "templates/visitorHomeTemplate/index.vtl");

            return new ModelAndView(model, "templates/layout.vtl");
        }, new VelocityTemplateEngine());


    }
}