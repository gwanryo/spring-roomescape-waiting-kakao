package nextstep.controller.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import nextstep.domain.Waiting;

@Getter
@RequiredArgsConstructor
@AllArgsConstructor
public class WaitingResponse {
    private long id;
    private ScheduleResponse schedule;
    private long waitNum;

    public WaitingResponse(Waiting waiting, long waitNum) {
        this.id = waiting.getId();
        this.schedule = waiting.getSchedule().toResponse();
        this.waitNum = waitNum;
    }
}
