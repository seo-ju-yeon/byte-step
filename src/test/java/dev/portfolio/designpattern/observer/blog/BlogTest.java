package dev.portfolio.designpattern.observer.blog;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BlogTest {

    private final Blog blog = new Blog();
    private final Reader readerA = new Reader();
    private final Reader readerB = new Reader();

    @Test
    void 새_글을_발행하면_모든_구독자가_제목을_받는다() {
        blog.subscribe(readerA);
        blog.subscribe(readerB);
        blog.publish("첫 번째 글");

        assertEquals(List.of("첫 번째 글"), readerA.getReceivedTitles());
        assertEquals(List.of("첫 번째 글"), readerB.getReceivedTitles());
    }

    @Test
    void 구독을_해제하면_다음_글부터_알림을_받지_않는다() {
        blog.subscribe(readerA);
        blog.subscribe(readerB);
        blog.publish("첫 번째 글");

        blog.unsubscribe(readerA);
        blog.publish("두 번째 글");

        assertEquals(List.of("첫 번째 글"), readerA.getReceivedTitles());
        assertEquals(List.of("첫 번째 글", "두 번째 글"), readerB.getReceivedTitles());
    }

    @Test
    void 나중에_구독하면_이전에_발행한_글은_받지_않는다() {
        blog.publish("첫 번째 글");
        blog.subscribe(readerA);
        blog.publish("두 번째 글");

        assertEquals(List.of("두 번째 글"), readerA.getReceivedTitles());
    }

    @Test
    void 구독자가_없어도_글을_발행할_수_있다() {
        assertDoesNotThrow(() -> blog.publish("첫 번째 글"));
    }

}