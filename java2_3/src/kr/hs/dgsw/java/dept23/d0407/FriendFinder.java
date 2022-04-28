package kr.hs.dgsw.java.dept23.d0407;

import java.util.Scanner;

public class FriendFinder {
	private final Friend[] friendList;
	
	
	public FriendFinder() {
		friendList = makeFriendList();
	}
	
	public String findName(int number) {
		for (Friend friend: friendList) {
			if (friend.number == number) {
				return friend.name;
			}
		}
		
		return null;
	}
	
	public int findNumber(String name) {
		for (Friend friend: friendList) {
			if (friend.name.equals(name)) {
				return friend.number;
			}
		}
		
		return -1;
	}
	
	public void execute() {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("ã�� ��ȣ�� �̸��� �Է��ϼ���.");
			String input = scanner.next();
			
			if ("quit".equals(input)) {
				break;
			}
			
			int number = 0;
			try {
				number = Integer.parseInt(input);
			} catch (NumberFormatException e) {
				// do nothing
			}
			
			if (number > 0) {
				String name = findName(number);
				if (name != null) {
					System.out.printf("%d���� �̸��� '%s'�Դϴ�.\n", number, name);
				} else {
					System.out.printf("%d���� �����ϴ�.\n", number);
				}
			} else {
				number = findNumber(input);
				if (number > 0) {
					System.out.printf("'%s'��(��) %d���Դϴ�.\n", input, number);
				} else {
					System.out.printf("%s�� 2�г� 3�� �л��� �ƴմϴ�.\n", input);
				}
			}
			
			
		}
		
		scanner.close();
		System.out.println("���α׷��� ����˴ϴ�.");
	}
	
	private Friend[] makeFriendList() {
		Friend[] list = {
			new Friend(1, "������")
			, new Friend(2, "������")
			, new Friend(3, "����")
			, new Friend(4, "����")
			, new Friend(5, "��μ�")
			, new Friend(6, "������")
			, new Friend(7, "�ں���")
			, new Friend(8, "�ڼ���")
			, new Friend(9, "������")
			, new Friend(10, "������")
			, new Friend(11, "�տ�")
			, new Friend(12, "����")
			, new Friend(13, "����")
			, new Friend(14, "������")
			, new Friend(15, "������")
			, new Friend(16, "�̽¹�")
			, new Friend(17, "����ȣ")
			, new Friend(18, "�ֹ���")
			, new Friend(19, "�ѻ��")
		};
		
		return list;
	}
	
	private class Friend {
		private final int number;
		
		private final String name;
		
		public Friend(int number, String name) {
			this.number = number;
			this.name = name;
		}
	}
	
	public static void main(String[] args) {
		FriendFinder friendFinder = new FriendFinder();
		friendFinder.execute();
		
		
	}
}
