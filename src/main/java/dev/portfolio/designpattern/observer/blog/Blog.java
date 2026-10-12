package dev.portfolio.designpattern.observer.blog;

import java.util.ArrayList;
import java.util.List;

/**
 * 옵저버 패턴을 사용해 새 글을 구독자에게 알리는 블로그를 구현한다.
 *
 * <p>예시:</p>
 * <ol>
 *     <li>독자 A와 독자 B를 블로그에 구독자로 등록한다.</li>
 *     <li>"첫 번째 글"을 발행하면 A와 B가 모두 제목을 전달받는다.</li>
 *     <li>A를 구독 해제한다.</li>
 *     <li>"두 번째 글"을 발행하면 B만 제목을 전달받는다.</li>
 * </ol>
 *
 * <p>요구사항:</p>
 * <ul>
 *     <li>{@code BlogSubscriber} 인터페이스에 새 글 제목을 받는
 *         {@code onNewPost(String title)} 메서드를 선언한다.</li>
 *     <li>{@code subscribe(BlogSubscriber subscriber)}로 구독자를 등록한다.</li>
 *     <li>{@code unsubscribe(BlogSubscriber subscriber)}로 구독자를 해제한다.</li>
 *     <li>{@code publish(String title)}을 호출하면 현재 등록된 모든 구독자에게
 *         새 글 제목을 전달한다.</li>
 *     <li>구독 전에 발행한 글은 나중에 구독한 사람에게 다시 알리지 않는다.</li>
 * </ul>
 *
 * <p>제한 조건: 같은 구독자를 중복 등록하지 않으며, 구독자와 제목은 null이 아니다.
 * 구독자가 없을 때 글을 발행해도 오류가 나지 않아야 한다.</p>
 */
public class Blog {

    // 구독자 보관 리스트
    private final List<BlogSubscriber> subscribers = new ArrayList<>();

    // 구독 추가
    public void subscribe(BlogSubscriber blogSubscriber) {
        subscribers.add(blogSubscriber);
    }

    // 구독 해제
    public void unsubscribe(BlogSubscriber blogSubscriber) {
        subscribers.remove(blogSubscriber);
    }

    // 새 글을 발행
    public void publish(String title) {
        for (BlogSubscriber blogSubscriber : subscribers) {
            blogSubscriber.onNewPost(title);
        }
    }
}
