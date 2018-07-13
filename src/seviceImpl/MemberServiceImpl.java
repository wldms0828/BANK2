package seviceImpl;
import java.util.List;

import domain.*;
import service.*;
public class MemberServiceImpl implements MemberService {
	private MemberBean[] list;//모든 정보를 한 개의 리스트에 다 담아야 하기 때문에
	private int count;
	
	public MemberServiceImpl() {
		list = new MemberBean[10];
		count = 0;
	}

	@Override
	public void createUser(UserBean user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createStaff(StaffBean staff) {
		// accessNum할 때 중간중간 랜덤숫자를 생성하지 말고 일단 고정값으로 두고 나중에 생성로직 짜기
		
	}

	@Override
	public List<MemberBean> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberBean> search(String param) {
		
		return null;
	}

	@Override
	public MemberBean search(MemberBean member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(MemberBean member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(MemberBean member) {
		// TODO Auto-generated method stub
		
	}


}
