package design.pattern.ch5.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DirectorTest {

    @Test
    @DisplayName("회사에서 근무하는 환경을 만든다.")
    void buildCompanyOfficeEnv() {
        Builder companyOfficeBuilder = new CompanyOfficeBuilder();
        Director director = new Director(companyOfficeBuilder);
        director.build();

        Office office = director.getOffice();
        System.out.println(office.toString());

        Assertions.assertEquals("직원는 오늘도 회사에서 맥북과 맥북 키보드과 맥북 터치패드으로 깐지나는 모니터 하나을 보며 열일 중이다.",
                office.toString());
    }

    @Test
    @DisplayName("집에서 근무하는 환경을 만든다.")
    void buildHomeOfficeEnv() {
        Builder companyOfficeBuilder = new HomeOfficeBuilder();
        Director director = new Director(companyOfficeBuilder);
        director.build();

        Office office = director.getOffice();
        System.out.println(office.toString());

        Assertions.assertEquals("노예는 오늘도 스윗 마이 홈에서 맥북과 키크론 K8과 로지텍 MX Master으로 빈티나는 모니터 두개을 보며 열일 중이다.",
                office.toString());
    }
}