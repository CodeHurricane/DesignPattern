package com.dongnao.sixrule.exchange;

import org.omg.CORBA.PUBLIC_MEMBER;
/**
 * 低层模块
 * @author Administrator
 */
class  Book implements IReadContent{
	public String getContent(){
		return "山里有个庙，庙里有个和尚";
	}
	
}

class NewsPager implements IReadContent
{
	public String getContent(){
		return "山里有个庙，庙里有个和尚";
	}
	
}
/**
 * 抽象接口
 * @author Administrator
 *
 */
interface IReadContent
{
	public String getContent();
}
/**
 * 高层模块
 */
class Mother
{
	public void narrate(IReadContent book)
	{
		System.out.println("妈妈：开始讲故事了");
		System.out.println("故事： "+book.getContent());
	}

}
public class Client {
	
public static void main(String[] args) {
	 IReadContent newsPager=null;
	 Mother mother=new Mother();
	 newsPager=new NewsPager();
	 //注入对象
	 mother.narrate(newsPager);
}
}
//public class Client {
//		public static void main(String[] args) {
//			/**
//			 * F  IGun
//			 * 
//			 * S  USPGun
//			 */
//			IGun iGun=new USPGun();
//			Player player=new Player();
//			player.buyGun(iGun);
//		}
//}
