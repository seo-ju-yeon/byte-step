package dev.portfolio.algorithm.map;

import java.util.HashMap;
import java.util.Map;

/**
 * 백준 17219번 '비밀번호 찾기'를 메서드 형태로 푼다.
 *
 * <p>저장된 사이트 주소와 비밀번호를 이용해, 요청한 사이트의 비밀번호를
 * 요청 순서대로 반환한다.</p>
 *
 * <p>예시:</p>
 * <ul>
 *     <li>sites = ["a.com", "b.com"]</li>
 *     <li>passwords = ["alpha", "beta"]</li>
 *     <li>queries = ["b.com", "a.com", "b.com"]</li>
 *     <li>결과 = ["beta", "alpha", "beta"]</li>
 * </ul>
 *
 * <p>제한 조건:</p>
 * <ul>
 *     <li>sites와 passwords의 길이는 같고, 각 인덱스의 값이 한 쌍이다.</li>
 *     <li>사이트 주소는 중복되지 않는다.</li>
 *     <li>queries의 모든 사이트 주소는 sites에 존재한다.</li>
 * </ul>
 */
public class PasswordFinder {

    public String[] solve(String[] sites, String[] passwords, String[] queries) {

        // 주소와 비밀번호 저장
        Map<String, String> passwordBySite = new HashMap<>();

        for (int i = 0; i < sites.length; i++) {
            passwordBySite.put(sites[i], passwords[i]);
        }

        // 비밀번호 찾고 반환
        String[] result = new String[queries.length];

        for (int i = 0; i < queries.length; i++) {
            result[i] = passwordBySite.get(queries[i]);

        }

        return result;
    }
}
