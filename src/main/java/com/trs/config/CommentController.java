package com.trs.config;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.season.core.ActionKey;
import com.season.core.Controller;
import com.season.core.ControllerKey;
import javafx.scene.control.IndexRangeBuilder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

/**
 * Created by 李超-pc on 2016/12/3.
 */

@ControllerKey("/season")
public class CommentController extends Controller {

    @ActionKey("saveComment")
    public void saveComment(){
        System.out.println(1111);
        String content = getPara("comment");
        String ProductName = getPara("product_name");
        Comment comment = new Comment();
        comment.setCommentContent(content);
        comment.setProductName(ProductName);
        comment.setCreateDate(new Date());
        ServiceFactory.getCommentServiceInstance().insert(comment);
        renderJson();
    }

    @ActionKey("findAllComments")
    public void findAllComments(){

        List<Comment> all = ServiceFactory.getCommentServiceInstance().findAll();
        renderJson("comments",all);

    }
    @ActionKey("delete")
    public void delete(){
        int id=getParaToInt("id");
       System.out.println(id);
        ServiceFactory.getCommentServiceInstance().delete(id);

        redirect("/index.html");
    }

    @ActionKey("findByid")
    public void findByid(){
        int id=getParaToInt("id");
        System.out.println(id);
        Comment comment=ServiceFactory.getCommentServiceInstance().get(id);
        renderJson("comment",comment);

    }
    @ActionKey("update")
    public void update(){
        System.out.println(1111);
        int id=getParaToInt("commentId");
        String content = getPara("commentContent");
        Date date=new Date();
        Comment comment = new Comment();
        comment.setCommentContent(content);
        comment.setCreateDate(date);
        ServiceFactory.getCommentServiceInstance().update(id,content,date);
        renderJson();

    }

}