package com.trs.config;
import com.season.core.db.Pojo;
import com.season.core.db.annotation.Column;
import com.season.core.db.annotation.TableInfo;
import com.season.core.db.annotation.Transient;

import java.util.Date;

/**
 * Created by 李超-pc on 2016/12/13.
 */

@TableInfo(tableName = Comment.tableName,pkName = "comment_id")
public class Comment extends Pojo<Comment>{

    public static final String tableName = "comment";

    @Column(name = "comment_id")
    private int commentId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "comment_content")
    private String commentContent;

    @Column(name = "create_date")
    private Date createDate;

    @Transient
    private String remark;

    public Comment(){}

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
