package design.pattern.ch5.builder;

/**
 * 설명 : What if... 디자인패턴이 아니라 Effective Java 였다면??
 */
public class WhatIfOffice {
    private String worker;
    private String workspace;
    private String pc;

    @Override
    public String toString() {
        return "What If... Office를 만든 빌더가 EffectiveJava 에서 말한거 였다면..?{" +
                "worker='" + worker + '\'' +
                ", workspace='" + workspace + '\'' +
                ", pc='" + pc + '\'' +
                '}';
    }

    public static class Builder {
        private String worker;
        private String workspace;
        private String pc;

        public Builder worker(String worker) {
            this.worker = worker;
            return this;
        }

        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public Builder pc(String pc) {
            this.pc = pc;
            return this;
        }

        public WhatIfOffice build(){
            return new WhatIfOffice(this);
        }
    }

    public WhatIfOffice(Builder builder) {
        worker = builder.worker;
        workspace = builder.workspace;
        pc = builder.pc;
    }
}
