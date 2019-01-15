package com.example.demo.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommonUtil {
	public static String datePattern = "yyyy-MM-dd hh:mm:ss";
	public static String datePattern1 = "yyyy-MM-dd";
	public static SimpleDateFormat dateFormate = new SimpleDateFormat(datePattern);
	public static SimpleDateFormat dateFormate1 = new SimpleDateFormat(datePattern1);

	// 如果字符串为null或""返回true
	public static boolean isEmpty(String name) {
		if (name == null || "".equals(name))
			return true;
		return false;
	}

	//判断数据是否为空，为空返回false，不为空返回true
	public static boolean isNotEmpty(String name) {
		return isEmpty(name) != true;
	}

	//类型转换（日期型转换成字符串型数据）
	public static String DateToString(Date date) {
		if (date != null) {
			synchronized (dateFormate) {
				return dateFormate.format(date);
			}
		}
		return null;
	}
	//类型转换（日期型转换成字符串型数据）
	public static Date stringToDate(String date) {
		if (date != null) {
			synchronized (dateFormate1) {
				try {
					return dateFormate1.parse(date);
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	//字符串格式化
	public static String numString(int len, long num) {
		StringBuffer sb = new StringBuffer();
		sb.append("%0").append(len).append("d");
		return String.format(sb.toString(), num);
	}

	// 首字母转换成大写
	public static String firstUpperCase(String content) {
		if (CommonUtil.isEmpty(content))
			return null;
		return content.substring(0, 1).toUpperCase() + content.substring(1);
	}

	//
	public static boolean checkIntegers(Integer... i){
		for (int j = 0; j < i.length; j++) {
			checkInteger(i[j]);
		}
		return true;
	}
	//正常返回true
	public static boolean checkInteger(Integer i){
		if(i < 1 || i == null){
			return false;
		}
		return true;
	}
	
	public static void checkPageAndRows(Integer page,Integer rows){
		if(page == null){
			page = 1;
		}
		if(rows == null){
			rows = 10;
		}
	}
	
	public static String dencodeHTML(String s) {
		s = s.replaceAll("equal", "=");
		return s;
	}
	
	public static List<Integer> getCartList(String carts){
		List<Integer> result = new ArrayList<>();
		String[] s = carts.split("-");
		for (String temp:s){
			result.add(Integer.valueOf(temp));
		}
		return result;
	}
}
