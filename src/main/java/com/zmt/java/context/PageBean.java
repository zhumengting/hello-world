package com.zmt.java.context;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;

import java.util.Collection;

/**
 * 页码式分页
 *
 * @author zhumengting
 * @data 2019-11-28 16:32
 * @email 444638290@qq.com
 */
public class PageBean<Model> {

   /**
    * 页码
    */
   public int page;

   /**
    * 每页数据量
    */
   public int pageSize;

   /**
    * 总数据量
    */
   public long totalItems;

   /**
    * 分页数据
    */
   public Collection<Model> list;

   /**
    * 扩展字段
    */
   @JSONField(unwrapped = true)
   public JSONObject ext;

   /**
    * 构造
    */
   public PageBean() {
   }

   /**
    * 构造
    *
    * @param page       页码
    * @param pageSize   每页数据量
    * @param totalItems 总数据量
    * @param list       分页数据
    */
   public PageBean(int page, int pageSize, long totalItems, Collection<Model> list) {
      this.page = page;
      this.pageSize = pageSize;
      this.totalItems = totalItems;
      this.list = list;
   }

   /**
    * 构造
    *
    * @param page       页码
    * @param pageSize   每页数据量
    * @param totalItems 总数据量
    * @param list       分页数据
    * @param ext        扩展数据
    */
   public PageBean(int page, int pageSize, long totalItems, Collection<Model> list, JSONObject ext) {
      this.page = page;
      this.pageSize = pageSize;
      this.totalItems = totalItems;
      this.list = list;
      this.ext = ext;
   }

   public int getPage() {
      return page;
   }

   public void setPage(int page) {
      this.page = page;
   }

   public int getPageSize() {
      return pageSize;
   }

   public void setPageSize(int pageSize) {
      this.pageSize = pageSize;
   }

   public long getTotalItems() {
      return totalItems;
   }

   public void setTotalItems(long totalItems) {
      this.totalItems = totalItems;
   }

   public Collection<Model> getList() {
      return list;
   }

   public void setList(Collection<Model> list) {
      this.list = list;
   }

   public JSONObject getExt() {
      return ext;
   }

   public void setExt(JSONObject ext) {
      this.ext = ext;
   }

}