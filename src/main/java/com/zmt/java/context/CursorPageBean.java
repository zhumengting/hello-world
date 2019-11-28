package com.zmt.java.context;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;

import java.util.Collection;

/**
 * 游标式分页
 *
 * @author zhumengting
 * @data 2019-11-28 16:32
 * @email 444638290@qq.com
 */
public class CursorPageBean<Model> {

   /**
    * 当前游标
    */
   public int currentCursor;

   /**
    * 下一个游标 -1终止
    */
   public int nextCursor;

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
   public CursorPageBean() {
   }

   /**
    * 构造
    *
    * @param currentCursor 当前游标
    * @param nextCursor    下一个游标
    * @param list          分页数据
    */
   public CursorPageBean(int currentCursor, int nextCursor, Collection<Model> list) {
      this.currentCursor = currentCursor;
      this.nextCursor = nextCursor;
      this.list = list;
   }

   /**
    * 构造
    *
    * @param currentCursor 当前游标
    * @param nextCursor    下一个游标
    * @param list          分页数据
    * @param ext           扩展数据
    */
   public CursorPageBean(int currentCursor, int nextCursor, Collection<Model> list, JSONObject ext) {
      this.currentCursor = currentCursor;
      this.nextCursor = nextCursor;
      this.list = list;
      this.ext = ext;
   }

   public int getCurrentCursor() {
      return currentCursor;
   }

   public void setCurrentCursor(int currentCursor) {
      this.currentCursor = currentCursor;
   }

   public int getNextCursor() {
      return nextCursor;
   }

   public void setNextCursor(int nextCursor) {
      this.nextCursor = nextCursor;
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