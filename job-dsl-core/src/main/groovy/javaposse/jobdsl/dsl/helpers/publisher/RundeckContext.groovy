package javaposse.jobdsl.dsl.helpers.publisher

import com.google.common.base.Preconditions
import com.google.common.base.Strings
import javaposse.jobdsl.dsl.helpers.Context

class RundeckContext implements Context {
    String jobId
    String options
    String nodeFilters
    String tag
    boolean shouldWaitForRundeckJob
    boolean shouldFailTheBuild

    void jobId(String jobId) {
        Preconditions.checkArgument(!Strings.isNullOrEmpty(jobId) , 'jobId cannot be null')
        this.jobId = jobId
    }

    void options(String options) {
        this.options = options
    }

    void nodeFilters(String nodeFilters) {
        this.nodeFilters = nodeFilters
    }

    void tag(String tag) {
        this.tag = tag
    }

    void shouldWaitForRundeckJob(boolean shouldWaitForRundeckJob) {
        this.shouldWaitForRundeckJob = shouldWaitForRundeckJob
    }

    void shouldFailTheBuild(boolean shouldFailTheBuild) {
        this.shouldFailTheBuild = shouldFailTheBuild
    }
}
