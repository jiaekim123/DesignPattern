package design.pattern.ch16.visitor;

import design.pattern.ch16.visitor.file.FileSearchVisitor;
import design.pattern.ch16.visitor.file.FileVisitorImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class FileVisitorTest {
    @Test
    @DisplayName("FileVisitor 기능을 확인하는 학습용 테스트")
    void fileVisitor() throws IOException {
        Path startingDir = Paths.get("/");
        FileVisitorImpl visitor = new FileVisitorImpl();
        Files.walkFileTree(startingDir, visitor);
    }

    @Test
    @DisplayName("FileSearchService 기능을 확인하는 학습용 테스트(탐색 실패)")
    void fileSearchVisitorFail() throws IOException {
        Path startingDir = Paths.get("/Users/Nova/git-jiae/DesignPattern/");
        String fileToSearch = "hibernate-guide.txt";
        FileSearchVisitor crawler = new FileSearchVisitor(fileToSearch, startingDir);
        Files.walkFileTree(startingDir, crawler);
    }

    @Test
    @DisplayName("FileSearchVisitor 기능을 확인하는 학습용 테스트(탐색 성공)")
    void fileSearchVisitorSuccess() throws IOException {
        Path startingDir = Paths.get("/Users/Nova/git-jiae/DesignPattern/");
        String fileToSearch = "settings.gradle";
        FileSearchVisitor crawler = new FileSearchVisitor(fileToSearch, startingDir);
        Files.walkFileTree(startingDir, crawler);
    }

}
