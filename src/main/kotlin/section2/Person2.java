package section2;

import org.jetbrains.annotations.Nullable;

public class Person2 {
    private final String name;

    public Person2(String name) {
        this.name = name;
    }

    @Nullable
    public String getName() {
        return name;
    }
}
