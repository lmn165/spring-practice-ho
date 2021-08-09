package inheritance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class MyFriendsTest {

    @Mock MyFriends myFriends;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        myFriends = new MyFriends();
    }

    @Test
    void getFriends() {
        Friend[] arr = myFriends.getFriends(new UnivFriend("LEE", "Computer", "010-333-555"),
                new UnivFriend("SEO", "Electronics", "010-222-444"),
                new CompFriend("YOON", "R&D 1", "02-123-999"),
                new CompFriend("PARK", "R&D 2", "02-321-777"));
        for(Friend f : arr){
            System.out.println(f.toString());
        }
        assertEquals("YOON", arr[2].getName());
    }
}