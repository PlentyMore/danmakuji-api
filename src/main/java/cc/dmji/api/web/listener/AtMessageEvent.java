package cc.dmji.api.web.listener;

import cc.dmji.api.entity.v2.ReplyV2;
import org.springframework.context.ApplicationEvent;

import java.util.List;

public class AtMessageEvent extends ApplicationEvent {
    private Long targetUid;
    private Long publisherUid;
    private ReplyV2 replyV2;
    private List<String> nicks;

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public AtMessageEvent(Object source) {
        super(source);
    }

    public AtMessageEvent(Object source, Long targetUid, Long publisherUid, ReplyV2 replyV2, List<String> nicks) {
        super(source);
        this.targetUid = targetUid;
        this.publisherUid = publisherUid;
        this.replyV2 = replyV2;
        this.nicks = nicks;
    }

    public Long getTargetUid() {
        return targetUid;
    }

    public void setTargetUid(Long targetUid) {
        this.targetUid = targetUid;
    }

    public Long getPublisherUid() {
        return publisherUid;
    }

    public void setPublisherUid(Long publisherUid) {
        this.publisherUid = publisherUid;
    }

    public ReplyV2 getReplyV2() {
        return replyV2;
    }

    public void setReplyV2(ReplyV2 replyV2) {
        this.replyV2 = replyV2;
    }

    public List<String> getNicks() {
        return nicks;
    }

    public void setNicks(List<String> nicks) {
        this.nicks = nicks;
    }
}
