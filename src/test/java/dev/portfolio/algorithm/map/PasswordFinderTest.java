package dev.portfolio.algorithm.map;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PasswordFinderTest {

    private final PasswordFinder passwordFinder = new PasswordFinder();

    @Test
    void 요청한_순서대로_비밀번호를_찾는다() {
        String[] sites = {"a.com", "b.com", "c.com"};
        String[] passwords = {"alpha", "beta", "gamma"};
        String[] queries = {"c.com", "a.com", "b.com"};

        assertArrayEquals(
                new String[]{"gamma", "alpha", "beta"},
                passwordFinder.solve(sites, passwords, queries)
        );
    }

    @Test
    void 같은_사이트를_여러_번_조회할_수_있다() {
        String[] sites = {"a.com", "b.com"};
        String[] passwords = {"same", "same"};
        String[] queries = {"b.com", "b.com", "a.com"};

        assertArrayEquals(
                new String[]{"same", "same", "same"},
                passwordFinder.solve(sites, passwords, queries)
        );
    }
}
