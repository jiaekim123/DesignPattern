package design.pattern.ch24.interpreter;

import java.util.List;

interface Expression {
    List<String> interpret(Context ctx);
}
