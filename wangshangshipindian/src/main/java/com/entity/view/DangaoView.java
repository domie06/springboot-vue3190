package com.entity.view;

import com.entity.DangaoEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 商品
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("dangao")
public class DangaoView extends DangaoEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 商品类型的值
		*/
		private String dangaoValue;
		/**
		* 地区的值
		*/
		private String diquValue;
		/**
		* 适宜人群的值
		*/
		private String renqunValue;
		/**
		* 是否上架的值
		*/
		private String shangxiaValue;



	public DangaoView() {

	}

	public DangaoView(DangaoEntity dangaoEntity) {
		try {
			BeanUtils.copyProperties(this, dangaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 商品类型的值
			*/
			public String getDangaoValue() {
				return dangaoValue;
			}
			/**
			* 设置： 商品类型的值
			*/
			public void setDangaoValue(String dangaoValue) {
				this.dangaoValue = dangaoValue;
			}
			/**
			* 获取： 地区的值
			*/
			public String getDiquValue() {
				return diquValue;
			}
			/**
			* 设置： 地区的值
			*/
			public void setDiquValue(String diquValue) {
				this.diquValue = diquValue;
			}
			/**
			* 获取： 适宜人群的值
			*/
			public String getRenqunValue() {
				return renqunValue;
			}
			/**
			* 设置： 适宜人群的值
			*/
			public void setRenqunValue(String renqunValue) {
				this.renqunValue = renqunValue;
			}
			/**
			* 获取： 是否上架的值
			*/
			public String getShangxiaValue() {
				return shangxiaValue;
			}
			/**
			* 设置： 是否上架的值
			*/
			public void setShangxiaValue(String shangxiaValue) {
				this.shangxiaValue = shangxiaValue;
			}













}
