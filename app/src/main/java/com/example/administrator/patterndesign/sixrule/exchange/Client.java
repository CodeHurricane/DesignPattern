package com.example.administrator.patterndesign.sixrule.exchange;

/**
 * �Ͳ�ģ��
 * @author Administrator
 */
class  Book implements IReadContent{
	public String getContent(){
		return "ɽ���и��������и�����";
	}
	
}

class NewsPager implements IReadContent
{
	public String getContent(){
		return "ɽ���и��������и�����";
	}
	
}
/**
 * ����ӿ�
 * @author Administrator
 *
 */
interface IReadContent
{
	public String getContent();
}
/**
 * �߲�ģ��
 */
class Mother
{
	public void narrate(IReadContent book)
	{
		System.out.println("���裺��ʼ��������");
		System.out.println("���£� "+book.getContent());
	}

}
public class Client{
	
public static void main(String[] args) {
	 IReadContent newsPager=null;
	 Mother mother=new Mother();
	 newsPager=new NewsPager();
	 //ע�����
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
