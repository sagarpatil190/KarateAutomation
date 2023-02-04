package com.karate.runner;
import com.intuit.karate.junit5.Karate;
public class Runner {
    @Karate.Test
    Karate testSample() {
        return Karate.run("classpath:com/karate/feature/sample.feature").relativeTo(getClass());
    }
}
