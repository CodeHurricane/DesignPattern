//package com.example.administrator.patterndesign.CompositePattern;
//
//import org.w3c.dom.Element;
//import org.w3c.dom.NodeList;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @ClassName: UpdateStep
// * @Description: 数据库升级脚本信息
// * @date 2012-12-6 下午1:46:32
// */
//public class UpdateStep extends Componet
//{
//	/**
//	 * 旧版本
//	 */
//	private String versionFrom;
//
//	/**
//	 * 新版本
//	 */
//	private String versionTo;
//
//
//
//	public UpdateStep(Element ele)
//	{
//		super(ele);
//		versionFrom = ele.getAttribute("versionFrom");
//		versionTo = ele.getAttribute("versionTo");
//	}
//
//	@Override
//	String getTitle() {
//		return "updateDb";
//	}
//
//	@Override
//	Componet getComponet(Element element) {
//		return new UpdateDb(element);
//	}
//
//	public String getVersionFrom()
//	{
//		return versionFrom;
//	}
//
//	public void setVersionFrom(String versionFrom)
//	{
//		this.versionFrom = versionFrom;
//	}
//
//	public String getVersionTo()
//	{
//		return versionTo;
//	}
//
//	public void setVersionTo(String versionTo)
//	{
//		this.versionTo = versionTo;
//	}
//
//}
