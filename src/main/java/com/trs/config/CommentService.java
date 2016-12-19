package com.trs.config;



import java.util.Date;
import java.util.List;


public class CommentService {

    public void insert(Comment vo){
        DAOFactory.getCommentDAOInstance().save(vo);
    }

    public void delete(int commentId){
        DAOFactory.getCommentDAOInstance().delete(commentId);
    }

    public void update(int commentId, String commentContent, Date date){
        DAOFactory.getCommentDAOInstance().update(commentId,commentContent,date);
    }
    public Comment get(int commentId){
        return  DAOFactory.getCommentDAOInstance().get(commentId);
    }
    public List<Comment> findAll(){
        return DAOFactory.getCommentDAOInstance().findAll();
    }

    public List<Comment> findAllByProduct(String productName){
        return DAOFactory.getCommentDAOInstance().findAllByProduct(productName);
    }


}
