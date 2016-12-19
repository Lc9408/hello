package com.trs.config;

import com.season.core.db.Dao;
import com.season.core.db.Pojo;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by 李超-pc on 2016/12/15.
 */
@Repository
public class CommentDAO {

    //评论数据的保存
    public void save(Comment vo){
        Dao.save(vo);
    }

    //评论数据的更新
    public void update(int commentId , String commentContent, Date CreateDate){
        Comment vo = new Comment();
        vo.setCommentId(commentId);
        vo.setCommentContent(commentContent);
        vo.setCreateDate(CreateDate);
        vo.update("comment_content","create_date");
    }

    //评论数据的删除
    public void delete(int commentId){
        Dao.deleteById(Comment.class,commentId);
    }

    public Comment get(int commentId){
        return Dao.findById(Comment.class,commentId);
    }

    //如果想要执行sql，可以这么写
    //Dao.execute("delete FROM comment WHERE create_date = ?
    // and comment_content = ?",new java.sql.Date(date.getTime()),"");

    //查询全部评论
    public List<Comment> findAll(){
        return Dao.findAll(Comment.class);
    }

    //根据产品名查询全部评论
    public List<Comment> findAllByProduct(String productName){
        return Dao.findByColumn(Comment.class,"product_name",productName);

    }

}
