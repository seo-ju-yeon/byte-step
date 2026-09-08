package dev.portfolio.designpattern.singleton;

/**
 * 프로그램 전체에서 하나의 객체만 존재하는 방문 횟수 관리자를 구현한다.
 *
 * <p>요구사항:</p>
 * <ul>
 *     <li>외부에서 생성자를 호출할 수 없어야 한다.</li>
 *     <li>{@code getInstance()}를 여러 번 호출해도 같은 객체를 반환해야 한다.</li>
 *     <li>{@code increase()}를 호출하면 방문 횟수가 1 증가해야 한다.</li>
 *     <li>서로 다른 변수가 가져온 객체에서도 방문 횟수가 공유되어야 한다.</li>
 * </ul>
 */
public class VisitCounter {

    private int visitCount;

    // 1. 생성자를 private로 구현
    // VisitCounter 클래스 내부에서만 인스턴스 생성을 제어할 수 있음
    private VisitCounter() {
    }

    // 2. 클래스가 하나의 인스턴스를 직접 관리함
    private static VisitCounter instance = null;

    // 3. 외부에서 참조할 수 있는 public 메서드 생성
    // getInstance() 메서드는 인스턴스 생성과 상관없이 호출할 수 있어야 함
    public static VisitCounter getInstance() {
        if (instance == null) {
            instance = new VisitCounter();
        }
        return instance;
    }

    public void increase() {
        // 방문 횟수 1 증가
        visitCount++;
    }

    public int getCount() {
        // 현재 방문 횟수 반환
        return visitCount;
    }
}
