package com.trs.config;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.season.core.ActionKey;
import com.season.core.Controller;
import com.season.core.ControllerKey;
import javafx.scene.control.IndexRangeBuilder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by 李超-pc on 2016/12/3.
 */

@ControllerKey("product")
public class CommentController extends Controller {

    @ActionKey("saveComment")
    public void saveComment(){
        int x=1+(int)(Math.random()*50);
        String content = getPara("comment");
        Comment comment = new Comment();
        comment.setCommentContent(content);
        comment.setProductName("person"+x);
        comment.setCreateDate(new java.sql.Date(System.currentTimeMillis()));
        ServiceFactory.getCommentServiceInstance().insert(comment);
        renderJson();
    }

    @ActionKey("AllComments")
    public void findAllComments(){
        List<Comment> all = ServiceFactory.getCommentServiceInstance().findAll();
        renderJson("comments",all);

    }
    @ActionKey("delete")
    public void delete(int id){
        System.out.println(id);
        ServiceFactory.getCommentServiceInstance().delete(id);


    }
}