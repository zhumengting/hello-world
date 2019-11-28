package com.zmt.java.context;

import com.alibaba.fastjson.JSONObject;

import java.util.Collection;

/**
 * 统一框架返回数据格式
 *
 * @author zhumengting
 * @data 2019-11-28 16:32
 * @email 444638290@qq.com
 */
public class Result<Model> {

   /**
    * 成功空对象
    */
   private static final Result<Object> EMPTY = new Result<Object>();

   /**
    * 元信息
    */
   private Meta meta = new Meta();

   /**
    * 返回数据
    */
   private Model data;

   /**
    * 默认
    */
   public Result() {
   }

   /**
    * s
    * 构造
    *
    * @param data 数据
    */
   public Result(Model data) {
      this.data = data;
   }

   /**
    * 构造
    *
    * @param code     接口状态值 0正常 非0异常
    * @param errorMsg 错误提示
    */
   public Result(int code, String errorMsg) {
      this.meta.setCode(code);
      this.meta.setErrorMsg(errorMsg);
   }

   /**
    * 构造
    *
    * @param code     接口状态值 0正常 非0异常
    * @param errorMsg 错误提示
    * @param data     返回数据
    */
   public Result(int code, String errorMsg, Model data) {
      this.meta.setCode(code);
      this.meta.setErrorMsg(errorMsg);
      this.data = data;
   }

   /**
    * 构建一个成功请求
    *
    * @return JSON
    */
   public static Result<Object> buildSuccess() {
      return EMPTY;
   }

   /**
    * 构建一个成功请求
    *
    * @param data 数据
    */
   public static <Model> Result<Model> buildSuccess(Model data) {
      return new Result<Model>(data);
   }


   /**
    * 构建一个带错误code 错误提示 失败请求
    *
    * @param code     接口状态值 0正常 非0异常
    * @param errorMsg 错误提示
    */
   public static <Model> Result<Model> buildFail(int code, String errorMsg) {
      return new Result<Model>(code, errorMsg);
   }

   /**
    * 构建一个带错误code 错误提示 返回值 失败请求
    *
    * @param code     接口状态值 0正常 非0异常
    * @param errorMsg 错误提示
    * @param data     数据
    */
   public static <Model> Result<Model> buildFail(int code, String errorMsg, Model data) {
      return new Result<Model>(code, errorMsg, data);
   }

   /**
    * 构建一个页码分页
    *
    * @param page       页码
    * @param pageSize   每页数据量
    * @param totalItems 总数据量
    * @param list       分页数据
    */
   public static <Model> Result<PageBean<Model>> buildPage(int page, int pageSize, long totalItems, Collection<Model> list) {
      return new Result(new PageBean(page, pageSize, totalItems, list));
   }

   /**
    * 构建一个页码分页 带扩展数据
    *
    * @param page       页码
    * @param pageSize   每页数据量
    * @param totalItems 总数据量
    * @param list       分页数据
    * @param ext        扩展数据
    */
   public static <Model> Result<PageBean<Model>> buildPage(int page, int pageSize, long totalItems, Collection<Model> list, JSONObject ext) {
      return new Result(new PageBean(page, pageSize, totalItems, list, ext));
   }

   /**
    * 构建一个游标分页 带扩展数据
    *
    * @param currentCursor 当前游标
    * @param nextCursor    下一个游标
    * @param list          分页数据
    */
   public static <Model> Result<CursorPageBean<Model>> buildCursorPage(int currentCursor, int nextCursor, Collection<Model> list) {
      return new Result(new CursorPageBean(currentCursor, nextCursor, list));
   }

   /**
    * 构建一个游标分页 带扩展数据
    *
    * @param currentCursor 当前游标
    * @param nextCursor    下一个游标
    * @param list          分页数据
    * @param ext           扩展数据
    */
   public static <Model> Result<CursorPageBean<Model>> buildCursorPage(int currentCursor, int nextCursor, Collection<Model> list, JSONObject ext) {
      return new Result(new CursorPageBean(currentCursor, nextCursor, list, ext));
   }

   /**
    * 元信息
    */
   public static class Meta {

      /**
       * 接口状态 非0异常
       */
      private int code;

      /**
       * 错误提示
       */
      private String errorMsg;

      /**
       * trace id
       */
      private String traceid;

      /**
       * span id
       */
      private String spanid;

      public Meta() {
      }

      public Meta(int code, String errorMsg, String traceid, String spanid) {
         this.code = code;
         this.errorMsg = errorMsg;
         this.traceid = traceid;
         this.spanid = spanid;
      }

      public int getCode() {
         return code;
      }

      public void setCode(int code) {
         this.code = code;
      }

      public String getErrorMsg() {
         return errorMsg;
      }

      public void setErrorMsg(String errorMsg) {
         this.errorMsg = errorMsg;
      }

      public String getTraceid() {
         return traceid;
      }

      public void setTraceid(String traceid) {
         this.traceid = traceid;
      }

      public String getSpanid() {
         return spanid;
      }

      public void setSpanid(String spanid) {
         this.spanid = spanid;
      }
   }

   public Model getData() {
      return data;
   }

   public void setData(Model data) {
      this.data = data;
   }

   public Meta getMeta() {
      return meta;
   }

   public void setMeta(Meta meta) {
      this.meta = meta;
   }
}
