package controller;


import javax.swing.JOptionPane;
import domain.*;
import service.*;
import seviceImpl.*;

enum Membutton{
	//join은 일반 유저추가, add는 직원 추가
	EXIT,
	JOIN,ADD,//create
	LIST,FIND_BY_ID,FIND_BY_NAME,COUNT,//전체 , one , some
	UPDATE,
	WITHDRAWAL
};
public class MemberController {
	public static void main(String[] args) {
		MemberBean member =null;
		MemberService service = new MemberServiceImpl();//가장먼저 일어나는 곳이 MemberServiceImpl 이기 때문에 list 를 초기화
		while(true) {
		
			switch((Membutton) JOptionPane.showInputDialog(null, // frame
					"Select function", // frame title
					"MemberMenu", // order
					JOptionPane.QUESTION_MESSAGE, // type
					null, // icon
					new Membutton[] {Membutton.EXIT,
					Membutton.JOIN,
					Membutton.ADD,
					Membutton.LIST,
					Membutton.FIND_BY_ID,
					Membutton.FIND_BY_NAME,
					Membutton.COUNT,
					Membutton.UPDATE,
					Membutton.WITHDRAWAL,
					}, // Array of choices
					null // default
							)) {
			/*
			 * uid,password,name,ssn,address,phone,email;
			 * */
			case EXIT : return;
			case JOIN :	
				
				break;
			case ADD:	
				
				break;
			case LIST : 
				JOptionPane.showMessageDialog(null, service.list());
				break;
			case FIND_BY_ID : 
				
				break;
			case FIND_BY_NAME : 
				
				break;
			case COUNT : 
				
				break;
			case UPDATE :
				
				break;
			case WITHDRAWAL : 
				break;
			default : break;
			}
		}
	}
}

