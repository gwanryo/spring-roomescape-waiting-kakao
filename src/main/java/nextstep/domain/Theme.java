package nextstep.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import nextstep.controller.dto.request.ThemeRequest;
import nextstep.controller.dto.response.ThemeResponse;

@Builder
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
public class Theme {
    private Long id;
    private String name;
    private String desc;
    private int price;

    public Theme(ThemeRequest theme) {
        this.name = theme.getName();
        this.desc = theme.getDesc();
        this.price = theme.getPrice();
    }

    public Theme(long id) {
        this.id = id;
    }

    public Theme(String name, String desc, int price) {
        this.name = name;
        this.desc = desc;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public int getPrice() {
        return price;
    }

    public ThemeResponse toResponse() {
        return ThemeResponse.builder().name(name).desc(desc).price(price).build();
    }
}
