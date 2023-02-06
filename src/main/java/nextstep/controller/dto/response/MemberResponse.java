package nextstep.controller.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@AllArgsConstructor
public class MemberResponse {
    private String username;
    private String name;
    private String phone;
    private String role;
}
