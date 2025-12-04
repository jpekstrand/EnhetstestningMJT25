import org.junit.jupiter.api.Test; 
import static org.junit.jupiter.api.Assertions.*; 
import org.mockito.ArgumentCaptor;
import static org.mockito.Mockito.*;
//import com.project.waitlist.WaitlistService;
//import com.project.waitlist.WaitlistRepository;
//import com.project.waitlist.WaitlistEntry;


public class AddTowaitlistTest {
    @Test
    void theRightUserInfoSavedToStorage(){
        WaitlistStorage waitlistStorageMock = mock(WaitlistStorage.class);

        WaitlistManager systemUnderTest = new WaitlistManager(waitlistStorageMock);
        
        String name = "Tom Tomtesson";
        String phone = "006";
        String email = "tom.tomtesson@tom.eu";
        
        ArgumentCaptor<UserContactInfo> userContactInfoCaptor = ArgumentCaptor.forClass(UserContactInfo.class);
        systemUnderTest.addToWaitlist(name, phone, email);
        verify(waitlistStorageMock).save(userContactInfoCaptor.capture());
        UserContactInfo captured = userContactInfoCaptor.getValue();
        assertEquals(name, captured.getName());
        assertEquals(phone, captured.getPhone());
        assertEquals(email, captured.getEmail());



    }

}
