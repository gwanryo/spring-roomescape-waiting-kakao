package nextstep.controller.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Builder
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
public class ScheduleResponse {
    private ThemeResponse theme;
    private LocalDate date;
    private LocalTime time;

    public ThemeResponse getTheme() {
        return theme;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }
}
