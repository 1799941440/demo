package com.example.demo.base;

import java.util.ArrayList;
import java.util.List;

public class JsonResult {
	private boolean success=true;
	private String msg;
	private long total;
	private int pageSize;
	private List rows=new ArrayList(0);
	
	
	
	public JsonResult(boolean success, String msg, long total, int pageSize, List datas) {
		super();
		this.success = success;
		this.msg = msg;
		this.total = total;
		this.pageSize = pageSize;
		this.rows = datas;
	}

	public void setErrMsg(String msg){
		this.success=false;
		this.msg=msg;
	}
	
   public void add(List datas){
	   if(datas!=null){
	   this.rows.addAll(datas);
	   this.pageSize=this.rows.size();
	   }
   }
   public void add(Object data){
	   rows.add(data);
	   if(data!=null){
		   this.pageSize=1;
	   }
   }
	
	

	public JsonResult(String msg) {
		super();
		this.msg = msg;
	}



	public JsonResult(List datas) {
		super();
		this.rows = datas;
		if(datas!=null){
			this.total=datas.size();
		}
	}

 

	public JsonResult(boolean success, String msg) {
		super();
		this.success = success;
		this.msg = msg;
	}

	public JsonResult() {
	}

	public boolean getSuccess() {
		return success;
	}



	public void setSuccess(boolean success) {
		this.success = success;
	}



	public String getMsg() {
		return msg;
	}



	public void setMsg(String msg) {
		this.msg = msg;
	}



	public long getTotal() {
		return total;
	}



	public void setTotal(long total) {
		this.total = total;
	}



	public int getPageSize() {
		return pageSize;
	}



	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}



	public List getRows() {
		return rows;
	}



	public void setRows(List datas) {
		this.rows = datas;
	}

	@Override
	public String toString() {
		return "jsonResult [success=" + success + ", msg=" + msg + ", total=" + total + ", pageSize=" + pageSize
				+ ", rows=" + rows + "]";
	}
	
	
	
	
}
