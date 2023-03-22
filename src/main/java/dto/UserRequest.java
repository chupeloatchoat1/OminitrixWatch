package dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserRequest {
    private String userID;
    private String avatar;
    private String email;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;
}
