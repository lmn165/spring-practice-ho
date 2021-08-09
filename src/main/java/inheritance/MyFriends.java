package inheritance;

import lombok.Data;

public class MyFriends {
    public Friend[] getFriends(Friend ... args){
        Friend[] friends = new Friend[args.length];
        int count = 0;
        for(Friend f : args){
            friends[count++] = f;
        }
        return friends;
    }

}

@Data class Friend{
    protected final String name;
    protected final String phone;
}

class UnivFriend extends Friend{
    private String major;
    public UnivFriend(String name, String major, String phone){
        super(name, phone);
        this.major = major;
    }

    @Override
    public String toString() {
        return "대학 동기{" +
                "이름: '" + name + '\'' +
                ", 전화: '" + phone + '\'' +
                ", 전공: '" + major + '\'' +
                '}';
    }
}

class CompFriend extends Friend{
    private String department;
    public CompFriend(String name, String department, String phone){
        super(name, phone);
        this.department = department;
    }

    @Override
    public String toString() {
        return "직장 동료{" +
                "이름: '" + name + '\'' +
                ", 전화: '" + phone + '\'' +
                ", 부서: '" + department + '\'' +
                '}';
    }
}