package com.trs.config;
/**
 * 服务层工厂
 * Created by JanusMix on 2016/10/20 0020.
 */
public class ServiceFactory {
    public static CommentService getCommentServiceInstance(){
        return new CommentService();
    }
}
