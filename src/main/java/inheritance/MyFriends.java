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

final class UnivFriend extends Friend{
    private String major;
    public UnivFriend(String name, String major, String phone){
        super(name, phone);
        this.major = major;
    }

    @Override
    public final String toString() {
        return String.format("대학 동기: %s %s %s", name, major, phone);
    }
}

final class CompFriend extends Friend{
    private String department;
    public CompFriend(String name, String department, String phone){
        super(name, phone);
        this.department = department;
    }

    @Override
    public final String toString() {
        return String.format("직장 동료: %s %s %s", name, department, phone);
    }
}