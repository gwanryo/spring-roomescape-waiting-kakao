package nextstep.controller.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@AllArgsConstructor
public class ScheduleRequest {
    private long themeId;
    private String date;
    private String time;
}
