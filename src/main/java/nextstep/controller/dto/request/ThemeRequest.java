package nextstep.controller.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@AllArgsConstructor
public class ThemeRequest {
    private String name;
    private String desc;
    private int price;
}
