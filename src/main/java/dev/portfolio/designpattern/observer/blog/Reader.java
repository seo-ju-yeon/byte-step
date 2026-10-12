package dev.portfolio.designpattern.observer.blog;

import java.util.ArrayList;
import java.util.List;

public class Reader implements BlogSubscriber {

    private final List<String> receivedTitles = new ArrayList<>();

    @Override
    public void onNewPost(String title) {
        receivedTitles.add(title);
    }

    public List<String> getReceivedTitles() {
        // 외부에서 원본 기록을 수정하지 못하도록 복사본을 반환
        return new ArrayList<>(receivedTitles);
    }
}
