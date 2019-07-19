package com.wxt.designpattern.builder.test03;

/**
 * @Author: weixiaotao
 * @ClassName XmlBuilder
 * @Date: 2018/10/23 19:25
 * @Description: 实现导出数据到XML文件的的构建器对象
 */

import java.util.Collection;
import java.util.Map;

public class XmlBuilder implements Builder {
	/**
	 * 用来记录构建的文件的内容，相当于产品
	 */
	private StringBuffer buffer = new StringBuffer();
	{
		buffer.append("<?xml version='1.0' encoding='gb2312'?>\n");
		buffer.append("<Report>\n");
	}
	@Override
	public void buildBody(
			Map<String, Collection<ExportDataModel>> mapData) {
		buffer.append("  <Body>\n");
		for(String tblName : mapData.keySet()){
			//先拼接表名称
			buffer.append("    <Datas TableName=\""+tblName+"\">\n");
			//然后循环拼接具体数据
			for(ExportDataModel edm : mapData.get(tblName)){
				buffer.append("      <Data>\n");
				buffer.append("        <ProductId>"+edm.getProductId()+"</ProductId>\n");
				buffer.append("        <Price>"+edm.getPrice()+"</Price>\n");
				buffer.append("        <Amount>"+edm.getAmount()+"</Amount>\n");
				buffer.append("      </Data>\n");
			}
			buffer.append("    </Datas>\n");
		}
		buffer.append("  </Body>\n");
	}

	@Override
	public void buildFooter(ExportFooterModel efm) {
		//对象的创建过程

		//不是由自己来创建对象，而是使用其它组件创建的对象
		//比如：简单工厂、工厂方法
		MyFooter mf = FooterFactory.createMyFooter();
		//组件组装过程
		buffer.append(mf.genFooter(efm));
		//buffer.append(efm.getExportUser());
	}
	@Override
	public void buildHeader(ExportHeaderModel ehm) {

		buffer.append("  <Header>\n");
		buffer.append("    <DepId>"+ehm.getDepId()+"</DepId>\n");
		buffer.append("    <ExportDate>"+ehm.getExportDate()+"</ExportDate>\n");
		buffer.append("  </Header>\n");
	}
	public StringBuffer getResult(){
		buffer.append("</Report>\n");
		return buffer;
	}

}
