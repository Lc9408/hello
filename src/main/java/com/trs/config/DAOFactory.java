package com.trs.config;




public class DAOFactory {
    public static CommentDAO getCommentDAOInstance(){
        return new CommentDAO();
    }
}
