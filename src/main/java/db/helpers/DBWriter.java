package db.helpers;

import db.DBHelper;
import models.Article;
import models.Writer;

import java.util.List;

public class DBWriter extends DBHelper {

    public static void deleteAll(){
        deleteAll(Writer.class);
    }

    public static List<Writer> getAll(){
        return getAll(Writer.class);
    }

    public static Writer find(int id){
        return find(id, Writer.class);
    }

    public static List<Article> getArticlesForWriter(Writer writer){
        return getAssociationsForAnObject(writer, Article.class, "author");
    }

}
