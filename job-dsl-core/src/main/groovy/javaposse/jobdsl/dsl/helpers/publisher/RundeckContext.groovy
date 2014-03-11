package javaposse.jobdsl.dsl.helpers.publisher

import com.google.common.base.Preconditions
import com.google.common.base.Strings
import javaposse.jobdsl.dsl.helpers.Context

class RundeckContext implements Context {
    String jobId
    Map<String, String> options = [:]
    Map<String, String> nodeFilters = [:]
    String tag = ''
    boolean shouldWaitForRundeckJob
    boolean shouldFailTheBuild

    void jobId(String jobId) {
        Preconditions.checkArgument(!Strings.isNullOrEmpty(jobId), 'jobId cannot be null or empty')
        this.jobId = jobId
    }

    void options(Map<String, String> options) {
        this.options = options
    }

    void option(String key, String value) {
        options[key] = value
    }

    void nodeFilters(Map<String, String> nodeFilters) {
        this.nodeFilters = nodeFilters
    }

    void nodeFilter(String key, String value) {
        nodeFilters[key] = value
    }

    void tag(String tag) {
        this.tag = tag
    }

    void shouldWaitForRundeckJob(boolean shouldWaitForRundeckJob = true) {
        this.shouldWaitForRundeckJob = shouldWaitForRundeckJob
    }

    void shouldFailTheBuild(boolean shouldFailTheBuild = true) {
        this.shouldFailTheBuild = shouldFailTheBuild
    }
}
