package com.entity.view;

import com.entity.DangaoCommentbackEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 商品评价
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("dangao_commentback")
public class DangaoCommentbackView extends DangaoCommentbackEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 dangao
			/**
			* 商品名称
			*/
			private String dangaoName;
			/**
			* 商品照片
			*/
			private String dangaoPhoto;
			/**
			* 商品类型
			*/
			private Integer dangaoTypes;
				/**
				* 商品类型的值
				*/
				private String dangaoValue;
			/**
			* 商品库存
			*/
			private Integer dangaoKucunNumber;
			/**
			* 地区
			*/
			private Integer diquTypes;
				/**
				* 地区的值
				*/
				private String diquValue;
			/**
			* 适宜人群
			*/
			private Integer renqunTypes;
				/**
				* 适宜人群的值
				*/
				private String renqunValue;
			/**
			* 商品原价
			*/
			private Double dangaoOldMoney;
			/**
			* 现价
			*/
			private Double dangaoNewMoney;
			/**
			* 点击次数
			*/
			private Integer dangaoClicknum;
			/**
			* 商品介绍
			*/
			private String dangaoContent;
			/**
			* 是否上架
			*/
			private Integer shangxiaTypes;
				/**
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer dangaoDelete;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 余额
			*/
			private Double newMoney;

	public DangaoCommentbackView() {

	}

	public DangaoCommentbackView(DangaoCommentbackEntity dangaoCommentbackEntity) {
		try {
			BeanUtils.copyProperties(this, dangaoCommentbackEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}













				//级联表的get和set dangao

					/**
					* 获取： 商品名称
					*/
					public String getDangaoName() {
						return dangaoName;
					}
					/**
					* 设置： 商品名称
					*/
					public void setDangaoName(String dangaoName) {
						this.dangaoName = dangaoName;
					}

					/**
					* 获取： 商品照片
					*/
					public String getDangaoPhoto() {
						return dangaoPhoto;
					}
					/**
					* 设置： 商品照片
					*/
					public void setDangaoPhoto(String dangaoPhoto) {
						this.dangaoPhoto = dangaoPhoto;
					}

					/**
					* 获取： 商品类型
					*/
					public Integer getDangaoTypes() {
						return dangaoTypes;
					}
					/**
					* 设置： 商品类型
					*/
					public void setDangaoTypes(Integer dangaoTypes) {
						this.dangaoTypes = dangaoTypes;
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
					* 获取： 商品库存
					*/
					public Integer getDangaoKucunNumber() {
						return dangaoKucunNumber;
					}
					/**
					* 设置： 商品库存
					*/
					public void setDangaoKucunNumber(Integer dangaoKucunNumber) {
						this.dangaoKucunNumber = dangaoKucunNumber;
					}

					/**
					* 获取： 地区
					*/
					public Integer getDiquTypes() {
						return diquTypes;
					}
					/**
					* 设置： 地区
					*/
					public void setDiquTypes(Integer diquTypes) {
						this.diquTypes = diquTypes;
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
					* 获取： 适宜人群
					*/
					public Integer getRenqunTypes() {
						return renqunTypes;
					}
					/**
					* 设置： 适宜人群
					*/
					public void setRenqunTypes(Integer renqunTypes) {
						this.renqunTypes = renqunTypes;
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
					* 获取： 商品原价
					*/
					public Double getDangaoOldMoney() {
						return dangaoOldMoney;
					}
					/**
					* 设置： 商品原价
					*/
					public void setDangaoOldMoney(Double dangaoOldMoney) {
						this.dangaoOldMoney = dangaoOldMoney;
					}

					/**
					* 获取： 现价
					*/
					public Double getDangaoNewMoney() {
						return dangaoNewMoney;
					}
					/**
					* 设置： 现价
					*/
					public void setDangaoNewMoney(Double dangaoNewMoney) {
						this.dangaoNewMoney = dangaoNewMoney;
					}

					/**
					* 获取： 点击次数
					*/
					public Integer getDangaoClicknum() {
						return dangaoClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setDangaoClicknum(Integer dangaoClicknum) {
						this.dangaoClicknum = dangaoClicknum;
					}

					/**
					* 获取： 商品介绍
					*/
					public String getDangaoContent() {
						return dangaoContent;
					}
					/**
					* 设置： 商品介绍
					*/
					public void setDangaoContent(String dangaoContent) {
						this.dangaoContent = dangaoContent;
					}

					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
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

					/**
					* 获取： 逻辑删除
					*/
					public Integer getDangaoDelete() {
						return dangaoDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setDangaoDelete(Integer dangaoDelete) {
						this.dangaoDelete = dangaoDelete;
					}






















				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}



}
