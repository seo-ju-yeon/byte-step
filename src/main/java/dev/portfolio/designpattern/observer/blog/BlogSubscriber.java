package dev.portfolio.designpattern.observer.blog;

public interface BlogSubscriber {

    // 새 글을 발행
    void onNewPost(String title);

}
