package com.trs.config;



import java.util.List;


public class CommentService {

    public void insert(Comment vo){
        DAOFactory.getCommentDAOInstance().save(vo);
    }

    public void delete(int commentId){
        DAOFactory.getCommentDAOInstance().delete(commentId);
    }

    public void update(int commentId,String commentContent){
        DAOFactory.getCommentDAOInstance().update(commentId,commentContent);
    }

    public List<Comment> findAll(){
        return DAOFactory.getCommentDAOInstance().findAll();
    }

    public List<Comment> findAllByProduct(String productName){
        return DAOFactory.getCommentDAOInstance().findAllByProduct(productName);
    }


}
